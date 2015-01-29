def tests
  require  'test/unit/assertions'
  include Test::Unit::Assertions

  input = [[0,2600,3800,2600,2500],
           [2600,0,5300,3900,4400],
           [3800,5300,0,1900,4500],
           [2600,3900,1900,0,3700],
           [2500,4400,4500,3700,0]
        ]
  assert_equal [13500, [1,2,3,4,5]], solve(input)
end

def solve(m)
  s = [[1, 2, 3, 4, 5],
       [1, 3, 2, 4, 5],
       [1, 3, 4, 2, 5],
       [1, 4, 3, 2, 5]
  ]
  min_sum = 5 * 10_000
  path = []
  (0...4).each do |i|
    sum = 0
    (1...5).each do |j|
      from = s[i][j - 1] - 1
      to = s[i][j] - 1
      sum += m[from][to]
    end
    if sum < min_sum
      min_sum = sum
      path = s[i]
    end
  end
  [min_sum, path]
end

input = []
5.times do
  input << gets.split(' ').map {|x| x.to_i}
end

s = solve input
puts s[0]
s[1].each {|x| print "#{x} "}

#tests

