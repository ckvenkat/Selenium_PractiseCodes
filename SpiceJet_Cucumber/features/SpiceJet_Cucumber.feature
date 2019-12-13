Feature: Search Flight
Scenario: Read data and search for flight
Given Read the excel sheet for the excel file "BookingDetails.xlsx"
When Search flights in the "SpiceJet" site for each excel row data
Then Close the application

Scenario Outline: Read data and search for flight1
Given Read the data "<fromcity>","<tocity>","<departMonth>","<returnMonth>","<departDate>","<returnDate>","<adults>","<child>","<infants>" from examples
When Search flights in the "SpiceJet" site for each data


Examples:
|fromcity|tocity|departMonth|returnMonth|departDate|returnDate|adults|child|infants|
|MAA|HYD|January|February|10|15|2|1|0|
|MAA|DEL|February|February|2|15|1|0|0|