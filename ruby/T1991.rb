def tests
  require 'test/unit/assertions'
  include Test::Unit::Assertions

  assert_equal solve(4, 5, [2,7,5,0]), [2, 8]
end

def solve(n, k, bumbum)
  d = 0 
  b = 0
  (0...n).each do |i|
    left = bumbum[i] - k
    if left > 0
      b += left
    else
      d += -left
    end
  end
  [b, d]
end

t = gets.chomp.split(' ')
n = t[0].to_i
k = t[1].to_i

bumbum = gets.chomp.split(' ').map{ |x| x.to_i }

r = solve n, k, bumbum
puts "#{r[0]} #{r[1]}"
