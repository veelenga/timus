def tests
  require 'test/unit/assertions'
  include Test::Unit::Assertions

  assert_equal 1, solve(2, 2)
  assert_equal 2, solve(3, 2)
  assert_equal 3, solve(3, 3)
  assert_equal 12, solve(6, 3)
  assert_equal 10, solve(5, 5)
  assert_equal 4, solve(4, 2)
  assert_equal 100, solve(15, 10)
end

def solve(n, k)
  min_per_team = n / k
  mod = n % k

  sum = 0
  players = n
  (k - 1).times do
    team = min_per_team
    if mod > 0
      team += 1
      mod -= 1
    end
    players -= team
    sum += team * (players)
  end
  sum
end

=begin
tests = gets.to_i

tests.times do
  ns = gets.chomp.split(' ')
  puts solve(ns[0].to_i, ns[1].to_i)
end
=end

tests
