inp = gets.split(' ').map {|x| x.to_i}

t1 = inp[0]
t2 = inp[1]
n1 = inp[2]
n2 = inp[3]

k = ((n2 - n1) * (t1 + 2 * t2) - t1).abs
puts k