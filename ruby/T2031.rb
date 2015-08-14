n = gets.to_i

res = case n
when 1
  '01'
when 2
  '11 01'
when 3
  '16 06 68'
when 4
  '16 06 68 88'
else
  'Glupenky Pierre'
end

puts res
