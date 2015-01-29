def tests
  require 'test/unit/assertions'
  include Test::Unit::Assertions

  assert_equal [2, 4], solve(14)
  assert_equal [4, 1], solve(4)
  assert_equal [8, 1], solve(8)
  assert_equal [8, 25], solve(500)
  assert_equal [15, 2], solve(31)
  assert_equal [9, 37], solve(999)
  assert_equal [8, 5], solve(50)
  assert_equal [163837, 5994], solve(999999999)
end

include Math

def solve(n)
  Math.sqrt(n*2).to_i.downto(0) do |p|
    a = ((2 * n) - p*p + p) / (2 * p)
    r = p * (p + 2*a -1)
    if 2*n == r
      return [a, p]
    end
  end
end

=begin
n = gets.to_i
r = solve n
r.each {|x| print "#{x} "}
=end

tests
