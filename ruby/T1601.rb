
def solve(text)
  recaps = ''
  begins = true

  text.each_char do |ch|

    if ("A".."Z").include? ch
      if !begins
        ch.downcase!
      else
        begins = false
      end
    end

    recaps << ch

    if "!?.".include?(ch)
      begins = true
    end
  end
  recaps
end

text = $stdin.readlines
puts solve(text.join)
