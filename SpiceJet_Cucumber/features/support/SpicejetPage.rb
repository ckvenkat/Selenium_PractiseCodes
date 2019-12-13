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
      if (currentDate == "#{date}" ) 
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
########################################################################################
def searchFlights(excelfromCity, exceltoCity,exceldepartMonth,excelreturnMonth,exceldepartDate,excelreturnDate,exceladults,excelchild,excelinfants,driver,wait)
driver.navigate.to "https://spicejet.com"
      driver.manage.window.maximize

      expect(driver.find_element(:xpath,"//label[@for=\"ctl00_mainContent_chk_friendsandfamily\"]").text).to eql("Family and Friends")

      puts "Welcome to SpiceJet! Please start planning your trip"
       

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
          element = driver.find_element(:xpath,"//a[@value=\"#{excelfromCity}\"]")
          element if element.displayed?
      }
      fromcity.click

      tocity = wait.until {
          element = driver.find_element(:xpath,"(//a[@value=\"#{exceltoCity}\"])[2]")
          element if element.displayed?
      }
      tocity.click

      ##Selecting Departure Date#################

      departuredate = wait.until {
          element = driver.find_element(:xpath,"//div[@class='ui-datepicker-title']")
          element if element.displayed?
      }

      calendarDatePick(exceldepartMonth, exceldepartDate, driver)

      e1=driver.find_element(:css,".picker-second>#view_fulldate_id_2")
      driver.action.move_to(e1).click.perform

      returndate = wait.until {
          element = driver.find_element(:css,".picker-second>#view_fulldate_id_2")
          element if element.displayed?
      }

      ##Selecting Return Date#################
      calendarDatePick(excelreturnMonth, excelreturnDate, driver)

      sleep 2
      element = driver.find_element(:id,"divpaxinfo")
      element.click
      sleep 2
      noOfPassengers(exceladults, excelchild, excelinfants,driver)

      submit = wait.until {
          element = driver.find_element(:xpath,"//input[@type=\"submit\"]")
          element if element.displayed?
      }
      submit.click
      sleep 10
      puts "Finding the best flight options! Please wait for your results"
      expect(driver.find_element(:xpath,"//span[@class=\"button-continue-text\"]").text).to eql("CONTINUE")
      puts "Flight Search Successful! Please choose a flight and complete booking"
end
