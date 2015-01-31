
def tests
  require 'test/unit/assertions'
  include Test::Unit::Assertions

  t = T2023.new

  assert_equal 5, t.solve(['Aurora', 'Tiana', 'Ariel', 'Mulan'])
  assert_equal 2, t.solve(['Dumbo'])
  assert_equal 1, t.solve(['Bambi', 'Belle'])
  assert_equal 0, t.solve(['Alice', 'Robin', 'Olaf'])

end

class T2023

  BOX1 = ['Alice', 'Ariel', 'Aurora',
          'Phil', 'Peter',  'Olaf',
          'Phoebus', 'Ralph', 'Robin']
  BOX2 = ['Bambi', 'Belle', 'Bolt',
          'Mulan', 'Mowgli', 'Mickey',
          'Silver', 'Simba', 'Stitch']
  BOX3 = ['Dumbo', 'Genie', 'Jiminy',
          'Kuzko', 'Kida', 'Kenai',
          'Tarzan', 'Tiana', 'Winnie']

  def solve(recep)
    curr = 0
    steps = 0
    recep.each do |r|
      if BOX1.include? r
        steps += (0 - curr).abs
        curr = 0
      elsif BOX2.include? r
        steps += (1 - curr).abs
        curr = 1
      elsif BOX3.include? r
        steps += (2 - curr).abs
        curr = 2
      end
    end
    steps
  end

end

n = gets.to_i
inp = []

n.times do
  inp << gets.chomp
end

puts T2023.new.solve inp

#tests
