Feature: Booking Accommodation

  @Test
  Scenario Outline:Booking Accommodation success
    Given the user enters main page
    When the user search the accommodation
      | ubication   | depart   | datein   | dateout   |
      | <ubication> | <depart> | <datein> | <dateout> |
    When then user select the accommodation
      | hotel   | room   | name   | lastname   | email   |
      | <hotel> | <room> | <name> | <lastname> | <email> |
    Then the user successfully add

    Examples:
      | ubication | depart          | datein     | dateout    |  hotel   | room   | name   | lastname   | email   |
          ##@externaldata@./src/test/resources/datadriven/Test.xlsx@bookingA@
   |Cali   |Valle del Cauca   |2021-11-16   |2021-11-20   |stein   |1   |prueba   |prueba   |prueba@gmail.com|
