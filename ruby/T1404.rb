def tests
  require 'test/unit/assertions'
  include Test::Unit::Assertions

  hack = EasyHack.new

  assert_equal 'xbduyr', hack.crypt('secret')
  assert_equal 'secret', hack.decrypt('xbduyr')

  word = ('a'..'z').to_a.shuffle.join
  assert_equal word, hack.decrypt(hack.crypt(word))
end

class EasyHack
  def initialize
    @letters = ('a'..'z').to_a
    @hash = Hash[@letters.zip (0..@letters.size)]
  end

  def crypt(word)
    # step 1
    lets = word.split ''
    lets.map! do |x|
      @hash[x]
    end

    #step 2
    lets[0] += 5
    (1...lets.size).each do |i|
      lets[i] += lets[i - 1]
    end

    # step 3
    lets.map! do |x|
      if x > 25
        x % 26
      else
        x
      end
    end

    # step 4
    lets.map! do |x|
      @letters[x]
    end

    #result
    lets.join
  end

  def decrypt(word)
    # step 1
    lets = word.split ''
    lets.map! do |x|
      @hash[x]
    end

    # step 2
    lets[0] += 26 if lets[0] < 5
    (1...lets.size).each do |i|
      #while lets[i] < lets[i - 1]
      #  lets[i] += 26
      #end
      if lets[i] < lets[i - 1]
        lets[i] += 26 * ((lets[i - 1] - lets[i]) / 26)
      end
    end

    # step 3
    (lets.size - 1).downto(1).each do |i|
      lets[i] -= lets[i - 1]
    end
    lets[0] -= 5

    # step 4
    lets.map! do |x|
      @letters[x]
    end

    # result
    lets.join
  end
end

=begin
s = gets.chomp
puts EasyHack.new.decrypt s
=end

tests

