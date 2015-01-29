def tests
  require 'test/unit/assertions'
  include Test::Unit::Assertions

  p = [10, 50, 100, 500, 1000, 5000]

  assert_equal [1, [4]],          solve([0,3,0,0,0,0],   33, p)
  assert_equal [2, [3, 4]],       solve([0,3,0,0,0,0],   35, p)

  assert_equal [5, [6,7,8,9,10]], solve([0,2,0,0,0,0], 10,   p)
  assert_equal [1, [11]],         solve([1,2,0,0,0,0], 10,   p)

  assert_equal [1, [1]],          solve([0,0,0,0,0,1], 5000, p)
  assert_equal [1, [1]],          solve([0,0,0,0,1,1], 5000, p)
  assert_equal [1, [1]],          solve([0,0,0,1,1,1], 5000, p)
  assert_equal [1, [1]],          solve([0,0,1,1,1,1], 5000, p)
  assert_equal [1, [1]],          solve([0,1,1,1,1,1], 5000, p)
  assert_equal [1, [1]],          solve([1,1,1,1,1,1], 5000, p)

  assert_equal [1, [2]],          solve([10,0,0,0,0,0], 50,  p)
  assert_equal [1, [1]],          solve([10,0,0,0,0,0], 100, p)
  assert_equal [1, [1]],          solve([0,3,0,0,0,0],  100, p)
  assert_equal [1, [1]],          solve([0,3,0,0,0,0],  100, p)
  assert_equal [1, [666]],        solve([1,1,1,1,1,1],   10, p)
  assert_equal [3, [3, 4 , 5]],   solve([0,2,0,0,0,0],   17, p)

  assert_equal [3, [14,15,16]],   solve([0,0,5,0,0,0],   30, p)

  assert_equal [1, [0]],           solve([0,2,0,0,0,0],  101, p)
  assert_equal [1, [0]],           solve([0,0,0,0,0,0],   10, p)
end

def solve(payed_banknotes, one_ticket_price, available_banknotes)
  total = 0
  smallest_banknote = 0
  payed_banknotes.size.times do |i|
    total += payed_banknotes[i] * available_banknotes[i]
    if smallest_banknote == 0 && payed_banknotes[i] != 0
      smallest_banknote = available_banknotes[i]
    end
  end
  max_tickets_payed_for = total / one_ticket_price
  min_tickets_payed_for = max_tickets_payed_for - smallest_banknote / one_ticket_price
  if min_tickets_payed_for < max_tickets_payed_for && min_tickets_payed_for * one_ticket_price <= total - smallest_banknote
    min_tickets_payed_for += 1
  end

  result = (min_tickets_payed_for..max_tickets_payed_for).to_a
  [result.size, result]
end

=begin
t = gets.split(' ').map {|x| x.to_i}
price = gets.to_i
result = solve t, price, [10, 50, 100, 500, 1000, 5000]

puts result[0]
result[1].each {|x| print "#{x} "}
=end

tests

