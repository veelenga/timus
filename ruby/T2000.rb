def tests
  puts solve([1,2,3,2,1], 3, 3) == [6, 3]
  puts solve([2,2,3,2,1], 3, 3) == [7, 3]

  puts solve([1,2,3,4,5,6,7,8,9,0], 4, 8) == [21, 24]
  puts solve([1,2,3,4,5,6,7,8,9,0], 7, 8) == [28, 17]
  puts solve([1,2,3,4,5], 4, 2)           == [12, 3]
  puts solve([1,2,3,4,5], 4, 3)           == [9, 6]

  puts solve([0,0,1,10,5,100,5,1,0,0], 3, 8) == [16, 106]
  puts solve([0,0,1,100,5,10,5,1,0,0], 3, 8) == [106, 16]

  puts solve([1,2,3,4,5], 1, 1) == [15, 0]
  puts solve([1,2,3,4,5], 5, 5) == [15, 0]
  puts solve([1,2,3,4,5], 3, 3) == [12, 3]

  puts solve([6821,1272,5737,5860,2795,178,2014,2766,5853,1875], 3, 1) == [28350, 6821]
  puts solve([2642,8283,4175,7165,2543,3135,5667,524,6171,4602,8856,9085,8219,3630], 11, 8) == [34392, 40305]
end

def solve(ar, p1, p2)
  sum1 = 0
  sum2 = 0
  if p1 == p2
    (p1...ar.size).each {|x| sum1 += ar[x]}
    (0...(p1 - 1)).each {|x| sum2 += ar[x]}
    if sum1 < sum2
      temp = sum1
      sum1 = sum2
      sum2 = temp
    end
    return [sum1 + ar[p1 - 1], sum2]
  elsif p1 < p2
    d = p1 + (p2 - p1) / 2
    (0...d).each       {|x| sum1 += ar[x]}
    (d...ar.size).each {|x| sum2 += ar[x]}
    return [sum1, sum2]
  else
    m = p1 - p2
    m += 1 if m % 2 != 0

    d = p2 - 1 + m / 2
    (0...d).each       {|x| sum1 += ar[x]}
    (d...ar.size).each {|x| sum2 += ar[x]}
    return [sum2, sum1]
  end
end

=begin
n = gets.chomp.to_i
ar = gets.chomp.split(' ').map { |x| x.to_i }
a = gets.chomp.split(' ').map { |x| x.to_i }

r = solve ar, a[0], a[1]
puts "#{r[0]} #{r[1]}"
=end

tests()
