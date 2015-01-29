
def tests
  require 'test/unit/assertions'
  include Test::Unit::Assertions

  def test(n, k)
    assert_equal ss(n, k), solve(n, k)
  end

  assert_equal 0, power(0)
  assert_equal 0, power(1)
  assert_equal 1, power(2)
  assert_equal 1, power(3)
  assert_equal 2, power(4)
  assert_equal 2, power(5)
  assert_equal 3, power(9)
  assert_equal 7, power(128)
  assert_equal 7, power(129)

  test 8, 4
  test 8, 3
  test 8, 1
  test 1, 1
  test 1, 8
  test 10, 8
  test 100, 8
  test 100, 18
  test 100, 11
  test 2, 20
  test 2, 100
  test 2, 1000
  test 16, 16
  test 8, 8
  test 1, 2
  test 1, 3
  test 1, 5
  test 2, 5
  test 2, 1
  test 2, 2
  test 2, 3
  test 2, 4
  test 3, 1
  test 3, 2
  test 3, 3
  test 1, 100
  test 1, 101
  test 1, 102
  test 256, 128
  test 512, 128
  test 3, 4
  test 8, 4
  test 8, 2
  test 16, 2
  test 32, 4
  test 64, 8
  test 649, 5
  test 679, 8
  test 13, 1
  test 13, 2
  test 13, 3
  test 13, 4
  test 13, 5
  test 13, 6
  test 13, 7
  test 13, 8
  test 13, 9
  test 13, 10
  test 13, 11
  test 13, 12
  test 13, 13
  test 11, 1
  test 11, 2
  test 11, 3
  test 11, 4

  assert_equal 999999999, solve(1000000000, 1)
end



def ss(n, k)
  return 0 if n == 1
  k = n if k > n

  time = 0
  pcs = 1
  while pcs < k
    pcs *= 2
    time += 1
  end
  while pcs < n
    pcs += k
    time += 1
  end
  return time
end

def power(n)
  return 0 if n < 2
  Math.log2(n).to_i
end

def solve(n, k)
  return 0 if n == 1
  k = n if k > n
  time = power(k)
  time += 1 if 2 ** time != k
  last = n - 2 ** time
  if last > 0
    time += last / k
    time += 1 if last % k > 0
  end
  return time
end

input = gets.split(' ')
n = input[0].to_i
k = input[1].to_i

print solve n, k



tests()
