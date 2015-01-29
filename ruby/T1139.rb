def tests
  require 'test/unit/assertions'
  include Test::Unit::Assertions

  assert_equal 4, solve(3, 2)
  assert_equal 2, solve(2, 2)
  assert_equal 13, solve(9, 5)
  assert_equal 8, solve(8, 4)
end

def solve(n, m)
  n + m - n.gcd(m)
end

=begin
inp = gets.split(' ')
n = inp[0].to_i - 1
m = inp[1].to_i - 1
puts solve(n, m)
=end

tests
