def tests
  require 'test/unit/assertions'
  include Test::Unit::Assertions

  assert_equal 4,   solve(3, 5)
  assert_equal 18,  solve(10, 15)
  assert_equal 6,   solve(4, 4)
  assert_equal 7,   solve(5, 4)
  assert_equal 6,   solve(4, 5)
  assert_equal 0,   solve(1, 9)
  assert_equal 1,   solve(9, 1)
end

def solve(n, m)
  [n * 2 - 2, m * 2 - 1].min
end

t = gets.split(' ')
n = t[0].to_i
m = t[1].to_i

print solve n, m

tests()


