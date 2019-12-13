system "clear"
num = 1
while num <= 100
	if num%3==0 && num%5==0
		puts "#{num}.Ruby"
	elsif num%3==0
		puts "#{num}.Three"
	elsif num%5==0
		puts "#{num}.Five"		
	end
	num +=1
end