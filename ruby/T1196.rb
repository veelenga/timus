def tests
  require 'test/unit/assertions'
  include Test::Unit::Assertions
end

matched = 0

n = gets.to_i
teacher = Array.new 10000
$stdin.take(n).each do |x|
  teacher[x.to_i] = true 
end

m = gets.to_i
$stdin.take(m).each do  |x|
  matched += 1 if teacher[x.to_i]
end

print matched
