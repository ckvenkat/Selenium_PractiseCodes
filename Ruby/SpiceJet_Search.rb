require 'rubygems'
require 'Selenium-webdriver'
require 'test/unit' 

include Test::Unit::Assertions

fromcity = "MAA"
tocity = "HYD"
departMonth = "March"
returnMonth = "September"
departDate = "10"
returnDate = "15"
adults = 2
child = 1
infants = 1

#########Calendar Pick Method###########################################################
def calendarDatePick(month, date, driver)
currentMonthStatus = false
while (!currentMonthStatus) 
 if driver.find_element(:css,".ui-datepicker-month").text == month
 	then
	datePick(date, driver)
    currentMonthStatus = true
 else
 	driver.find_element(:css,"[class='ui-icon ui-icon-circle-triangle-e']").click
 end
end
end
#########Date Pick Method###############################################################
def datePick(date, driver)
	dates = driver.find_elements(:xpath,"//a[@class=\"ui-state-default\"]")
	count = dates.length
   #puts count
   for dt in dates 
			currentDate = dt.text
			if (currentDate == date) 
				then
				dt.click
				break
			end
	end
end
#########Passengers Selection###########################################################
def noOfPassengers(adults, child, infants,driver)
	if adults > 0
		driver.find_element(:xpath,"//select[@id=\"ctl00_mainContent_ddl_Adult\"]//option[@value=#{adults}]").click
	end
	if child > 0
		driver.find_element(:xpath,"//select[@id=\"ctl00_mainContent_ddl_Child\"]//option[@value=#{child}]").click
	end
	if infants > 0
		driver.find_element(:xpath,"//select[@id=\"ctl00_mainContent_ddl_Infant\"]//option[@value=#{infants}]").click
	end
end
#########Flow Starting Point############################################################

driver = Selenium::WebDriver.for :chrome
driver.navigate.to "https://spicejet.com"
driver.manage.window.maximize

wait = Selenium::WebDriver::Wait.new(:timeout => 60)

assert_equal(driver.find_element(:xpath,"//label[@for=\"ctl00_mainContent_chk_friendsandfamily\"]").text, "Family and Friends", failure_message = "Launch Failed")

if (driver.find_element(:xpath,"//input[@id=\"ctl00_mainContent_rbtnl_Trip_1\"]").selected?) == false
then
driver.find_element(:xpath,"//input[@id=\"ctl00_mainContent_rbtnl_Trip_1\"]").click
end

cityselect = wait.until {
    element = driver.find_element(:xpath,"//*[@id=\"marketCityPair_1\"]//span[@id=\"ctl00_mainContent_ddl_originStation1_CTXTaction\"]")
    element if element.displayed?
}
cityselect.click

fromcity = wait.until {
    element = driver.find_element(:xpath,"//a[@value=\"#{fromcity}\"]")
    element if element.displayed?
}
fromcity.click

tocity = wait.until {
    element = driver.find_element(:xpath,"(//a[@value=\"#{tocity}\"])[2]")
    element if element.displayed?
}
tocity.click

##Selecting Departure Date#################

departuredate = wait.until {
    element = driver.find_element(:xpath,"//div[@class='ui-datepicker-title']")
    element if element.displayed?
}

calendarDatePick(departMonth, departDate, driver)

e1=driver.find_element(:css,".picker-second>#view_fulldate_id_2")
driver.action.move_to(e1).click.perform

returndate = wait.until {
    element = driver.find_element(:css,".picker-second>#view_fulldate_id_2")
    element if element.displayed?
}

##Selecting Return Date#################
calendarDatePick(returnMonth, returnDate, driver)

sleep 10

passengersdropdown = wait.until {
    element = driver.find_element(:id,"divpaxinfo")
    element if element.displayed?
}
passengersdropdown.click

noOfPassengers(adults, child, infants,driver)

submit = wait.until {
    element = driver.find_element(:xpath,"//input[@type=\"submit\"]")
    element if element.displayed?
}
submit.click
sleep 10
#wait.until { driver.find_element(:id, "continue-to-contact-page").displayed? }
assert_equal(driver.find_element(:xpath,"//span[@class=\"button-continue-text\"]").text, "CONTINUE", failure_message = "Search Failed")
