Feature: Booking car rentals

  @Test
  Scenario Outline:Booking cars success
    Given the user enters main page
    When the user search the cars
      | location   | mounthin   | datein   | mounthout   | dateout   |
      | <location> | <mounthin> | <datein> | <mounthout> | <dateout> |
    Then then user select successfully the cars

    Examples:
      | location | mounthin    | datein      | mounthout | dateout |
          ##@externaldata@./src/test/resources/datadriven/Test.xlsx@bookingC@
   |Los Angeles, California, United States of America   |November   |21   |November   |23|
