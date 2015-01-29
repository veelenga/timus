def tests
  require 'test/unit/assertions'
  include Test::Unit::Assertions

  assert_equal 3, solve(1)
  assert_equal 12, solve(2)
  assert_equal 30, solve(3)
  assert_equal 515100, solve(100)
  assert_equal 501501000, solve(1000)
end

def solve(n)
  r = 0
  1.upto(n) do |x|
    r += 3 * x * (x + 1) / 2
  end
  r
end

=begin
n = gets.to_i
p solve n
=end

tests