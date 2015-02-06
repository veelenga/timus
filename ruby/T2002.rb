class User
  attr_reader :username, :password, :logged_in

  def initialize(username, password, logged_in=false)
    @username = username
    @password = password
    @logged_in = logged_in
  end

  def login
    @logged_in = true
  end

  def logout
    @logged_in = false
  end
end

class Forum

  def initialize
    @users = Array.new
  end

  def register(username, password)
    if user_exists? username
      'fail: user already exists'
    else
      @users << User.new(username, password)
      'success: new user added'
    end
  end

  def login(username, password)
    u = find_user username
    unless u
      'fail: no such user'
    else
      unless u.password.eql? password
        'fail: incorrect password'
      else
        if u.logged_in
          'fail: already logged in'
        else
          u.login
          'success: user logged in'
        end
      end
    end
  end

  def logout(username)
    u = find_user username
    unless u
      'fail: no such user'
    else
      unless u.logged_in
        'fail: already logged out'
      else
        u.logout
        'success: user logged out'
      end
    end
  end

  def action(operation)
    tokens = operation.split(' ')
    case tokens[0]
    when 'register'
      register(tokens[1], tokens[2])
    when 'login'
      login(tokens[1], tokens[2])
    when 'logout'
      logout(tokens[1])
    else
      # do nothing
    end
  end

  private

  def user_exists?(username)
    find_user(username)
  end

  def find_user(username)
    @users.each do |u|
      return u if u.username.eql? username
    end
    nil
  end
end

forum = Forum.new

n = gets.chomp.to_i
n.times do
  puts forum.action(gets.chomp!)
end
