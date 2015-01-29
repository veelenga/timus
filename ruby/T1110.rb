r = gets.chomp.split(' ').map {|x| x.to_i}
N = r[0]
M = r[1]
Y = r[2]

found = false
0.upto(M - 1) do |x|
  m = (x ** N) % M
  if m == Y
    print "#{x} "
    found = true
  end
end

print "-1" if !found
