def tests
  require 'test/unit/assertions'
  include Test::Unit::Assertions

  ########
  # TEST 1
  ########
  root = 'Isenbaev'
  names = [['Isenbaev', 'Oparin', 'Toropov'],
           ['Ayzenshteyn', 'Oparin', 'Samsonov'],
           ['Ayzenshteyn', 'Chevdar', 'Samsonov'],
           ['Fominykh', 'Isenbaev', 'Oparin'],
           ['Dublennykh', 'Fominykh', 'Ivankov'],
           ['Burmistrov', 'Dublennykh', 'Kurpilyanskiy'],
           ['Cormen', 'Leiserson', 'Rivest']
  ]

  result = solve root, names

  assert_equal 2,   result['Ayzenshteyn']
  assert_equal 3,   result['Burmistrov']
  assert_equal 3,   result['Chevdar']
  assert_equal nil, result['Cormen']
  assert_equal 2,   result['Dublennykh']
  assert_equal 1,   result['Fominykh']
  assert_equal 0,   result['Isenbaev']
  assert_equal 2,   result['Ivankov']
  assert_equal 3,   result['Kurpilyanskiy']
  assert_equal nil, result['Leiserson']
  assert_equal 1,   result['Oparin']
  assert_equal nil, result['Rivest']
  assert_equal 2,   result['Samsonov']
  assert_equal 1,   result['Toropov']

  ########
  # TEST 2
  ########
  root = "NotFound"
  names = [['Name1', 'Name2', 'Name3'],
           ['Name4', 'Name5', 'Name6']
  ]
  result = solve root, names

  assert_equal nil, result['Name1']
  assert_equal nil, result['Name2']
  assert_equal nil, result['Name3']
  assert_equal nil, result['Name4']
  assert_equal nil, result['Name5']
  assert_equal nil, result['Name6']
  assert_equal nil, result[root]
end

def get_hash(root, names)
  hash = Hash.new
  number = 1
  names.flatten.each do |name|
    if name == root
      hash[name] = 0
    elsif hash[name] == nil
      hash[name] = number
      number += 1
    end
  end
  hash
end

def graph(hash, names)
  graph = Array.new hash.size
  # Save trick when no root in the graph
  graph[0] = []
  names.each do |x|
    n1 = hash[x[0]]
    n2 = hash[x[1]]
    n3 = hash[x[2]]
    graph[n1] = [] if graph[n1] == nil
    graph[n2] = [] if graph[n2] == nil
    graph[n3] = [] if graph[n3] == nil
    graph[n1] << n2 << n3
    graph[n2] << n1 << n3
    graph[n3] << n1 << n2
  end
  graph
end

def bfs(graph, start)
  marked = Array.new graph.size
  distance = Array.new graph.size

  queue = [] << start
  marked[start] = true
  distance[0] = 0
  while (queue.size != 0)
    v = queue.shift
    graph[v].uniq.each do |w|
      if !marked[w]
        #puts "#{v} -> #{w}"
        queue << w
        marked[w] = true
        distance[w] = distance[v] + 1
      end
    end
  end
  distance
end

def print_result(result)
  result.each do |name, dist|
    dist = 'undefined' if dist == nil
    puts "#{name} #{dist}"
  end
end

def solve(root, names)
  hash      = get_hash root, names
  graph     = graph hash, names
  distance  = bfs graph, 0
  result    = Hash.new
  hash.sort.each do |name, num|
    result[name] = distance[num]
  end
  result
end

n = gets.to_i
names = Array.new n
n.times do |x|
  names[x] = gets.split(' ')
end

print_result solve('Isenbaev', names)

#tests


