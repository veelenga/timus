def tests
  require 'test/unit/assertions'
  include Test::Unit::Assertions

  assert_equal "Yes", solve(7)
  assert_equal "No",  solve(5)
end

def solve(f)
  time = (12 - f) * 45
  if time <= 240
    "YES"
  else
    "NO"
  end
end

f = gets.to_i
puts solve(f)

#tests()
