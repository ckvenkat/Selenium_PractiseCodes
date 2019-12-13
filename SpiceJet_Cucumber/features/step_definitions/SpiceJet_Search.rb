
dir_to_excel = Dir.pwd + '/features/support'
@read_workbook = 0
driver = Selenium::WebDriver.for :chrome
wait = Selenium::WebDriver::Wait.new(:timeout => 60)

#########Flow Starting Point############################################################

Given(/^Read the excel sheet for the excel file "([^"]*)"$/) do |excel_file| 
  @read_workbook = RubyXL::Parser.parse("#{dir_to_excel}/#{excel_file}")
end

When(/^Search flights in the "([^"]*)" site for each excel row data$/) do |sitename|
  sheet1=@read_workbook['Sheet1']
  
  sheet1.drop(1).each do |row|

    currentRow = row

    #column iterate
      excelfromCity = currentRow[0].value
      exceltoCity = currentRow[1].value
      exceldepartMonth = currentRow[2].value
      excelreturnMonth = currentRow[3].value
      exceldepartDate = currentRow[4].value
      excelreturnDate = currentRow[5].value
      exceladults = currentRow[6].value
      excelchild = currentRow[7].value
      excelinfants = currentRow[8].value

      searchFlights(excelfromCity, exceltoCity,exceldepartMonth,excelreturnMonth,exceldepartDate,excelreturnDate,exceladults,excelchild,excelinfants,driver,wait)
      
  end
 
end

Then(/^Close the application$/) do
  puts "close app"
end


Given(/^Read the data "([^"]*)","([^"]*)","([^"]*)","([^"]*)","([^"]*)","([^"]*)","([^"]*)","([^"]*)","([^"]*)" from examples$/) do |excelfromCity,exceltoCity,exceldepartMonth,excelreturnMonth,exceldepartDate,excelreturnDate,exceladults,excelchild,excelinfants|
  exceladults=exceladults.to_i
  excelchild=excelchild.to_i
  excelinfants=excelinfants.to_i
  
  searchFlights(excelfromCity,exceltoCity,exceldepartMonth,excelreturnMonth,exceldepartDate,excelreturnDate,exceladults,excelchild,excelinfants,driver,wait)
end

When(/^Search flights in the "([^"]*)" site for each data$/) do |site|
  puts "#{site}"
end

