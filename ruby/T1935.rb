gets.to_i

sum, max = 0, 0
gets.split(' ').each do |x|
  x = x.to_i
  sum += x
  max = x if x > max
end

print sum + max
