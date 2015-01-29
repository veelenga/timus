n = gets.chomp.to_i

table = []
0.upto(n - 1) do |x|
  table << gets.split(" ").map{|x| x.to_i}
end

100.downto(0) do |x|
  table.each do |x1, x2|
    puts "#{x1} #{x2}" if x2 == x
  end
end
