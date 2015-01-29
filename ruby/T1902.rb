def tests
  require 'test/unit/assertions'
  include Test::Unit::Assertions

  assert_equal [640.0, 650.0], solve(60, 600, [620, 640])
  assert_equal [630.0, 645.0], solve(60, 600, [600, 630])
  assert_equal [640.0, 655.0], solve(60, 620, [600, 630])
  assert_equal [650.0, 665.0], solve(60, 640, [600, 630])

  assert_equal [630.0, 635.0, 640.0, 645.0, 650.0, 655.0, 660.0], solve(60, 600, [600, 610, 620, 630, 640, 650, 660])
end

def solve(t, s, times)
  result = Array.new times.count
  result[0] = [times[0], s].max  + (t - (times[0] - s).abs) / 2.0
  (1...times.count).each do |n|
    nt = result[n - 1] + (times[n] - times[n - 1]) / 2.0
    result[n] = nt
  end
  result
end

inp = gets.split ' '
n = inp[0].to_i
t = inp[1].to_i
s = inp[2].to_i

times = gets.split(' ').map {|x| x.to_i}
r = solve t, s, times
r.each {|x| print(%q{%.6f } % x)}

tests
