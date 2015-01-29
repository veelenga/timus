class TwoTeam
	def initialize(graph)
		@graph = graph
		@colors = Array.new graph.size
	end

	def solve
		@graph.size.times do |x|
			if @colors[x] == nil
				bfs @graph, @colors, x
				#p @colors
			end
		end

		result = []
		@colors.size.times do |i|
			return 0 if @colors[i] == nil
			result << i if @colors[i]
		end
		return result
	end

	def bfs(graph, colors, start)
		queue = [] << start
		colors[start] = true if graph[start].size > 0
		while queue.size != 0
			v = queue.shift
			graph[v].each do |w|
				if colors[w] == nil
					#puts "#{v} -> #{w}"
					colors[w] = !colors[v]
					queue << w
				end
			end
		end
		colors
	end

	private :bfs

end

=begin
n = gets.to_i

graph = []
n.times do |x|
	friend = gets.split ' '
	friend = friend.map { |x| x.to_i - 1}.select {|x| x >= 0}
	graph << friend
end
=end

graph = [[1, 2], [2, 0], [0, 1, 3, 4], [2], [2], [], []]
result = TwoTeam.new(graph).solve
if result == 0
	print result
else
	puts result.size
	result.each {|x| print "#{x + 1} " }
end


