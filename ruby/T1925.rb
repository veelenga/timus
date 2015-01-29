def tests
  puts solve(6, 5, [3,3,5,6,5,7], [1,1,3,5,5,2]) == 3
  puts solve(1, 3, [4], [6]) == "Big Bang!"
end

def sum(b)
  b.inject(:+)
end

def solve (n, k, b, g)
  e = sum(b) - n * 2 + k - 2
  a = sum(g)
  r = e - a
  if r > 0
    return r
  else
    return "Big Bang!"
  end
end

t = gets.chomp.split(' ')

n = t[0].to_i
k = t[1].to_i

b = []
g = []
(0...n).each { |x|
  t = gets.chomp.split(' ')
  b << t[0].to_i
  g << t[1].to_i
}

puts solve n, k, b, g
