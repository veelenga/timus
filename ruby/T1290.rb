
n = gets.to_i
a = Array.new n
(0...n).each do |i|
  a[i] = gets.to_i
end

a.sort!

(n - 1).downto(0) {|x| puts a[x]}