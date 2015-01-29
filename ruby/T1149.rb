def tests
  require 'test/unit/assertions'
  include Test::Unit::Assertions
  
  assert_equal solve(3), "((sin(1)+3)sin(1-sin(2))+2)sin(1-sin(2+sin(3)))+1";
end

def a(n, k)
  print "sin(#{k}" 
  if n > k
    if k % 2 == 1
      print "-"
    else
      print "+"
    end
    a(n, k+1)
  end
  print ")"
end

def s(n, k)
  if (k < n)
    print "("
    s n, k + 1
    print ")"
  end
  a n - k + 1, 1
  print "+#{k}"
end

def solve(n)
  s n, 1    
end

n = gets.chomp.to_i
solve(n)


