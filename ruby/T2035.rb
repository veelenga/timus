def tests
  require 'test/unit/assertions'
  include Test::Unit::Assertions

  assert_equal [2, 3], solve(2, 7, 5)
  assert_equal nil,    solve(9, 15, 100)
  assert_equal nil,    solve(0, 0, 1)
  assert_equal nil,    solve(1, 1, 3)

  def check(x, y, c)
    ab = solve(x, y, c)
    assert_equal ab[0] + ab[1], c

    assert ab[0] >= 0
    assert ab[0] <= x

    assert ab[0] >= 0
    assert ab[1] <= y
  end

  #     X, Y, C
  check(1, 2, 3)
  check(1, 3, 3)
  check(2, 3, 3)
  check(3, 3, 3)
  check(4, 3, 3)
  check(0, 0, 0)
  check(100, 0, 1)
  check(0, 100, 1)
  check(10, 10, 1)
end

def solve(x, y, c)
  if x + y >= c
    if x <= c
      [x, c - x]
    else
      [c, 0]
    end
  else
    nil
  end
end

inp = gets.split(' ').map{ |x| x.to_i }
x = inp[0]
y = inp[1]
z = inp[2]

s = solve(x, y, z)
if s
  puts "#{s[0]} #{s[1]}"
else
  puts 'Impossible'
end
