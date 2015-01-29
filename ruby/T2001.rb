w = []
1.upto(3) do |x|
  token = gets.chomp.split ' '
  w << token
end

a1 = Integer(w[0][0]); b1 = Integer(w[0][1])
a2 = Integer(w[1][0]); b2 = Integer(w[1][1])
a3 = Integer(w[2][0]); b3 = Integer(w[2][1])

x = b3 - b1
y = a2 - a1

puts "#{x} #{y}"
