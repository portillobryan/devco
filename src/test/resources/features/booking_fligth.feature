Feature: Booking fligth

  @Test
  Scenario Outline:Booking fligth success
    Given the user enters main page
    When the user search the fligth
      | origen   | destino   | datein   | dateout   |
      | <origen> | <destino> | <datein> | <dateout> |
    Then then user select successfully the fligth

    Examples:
      | origen | destino | datein      | dateout     |
          ##@externaldata@./src/test/resources/datadriven/Test.xlsx@bookingF@
   |Cali   |MDE   |November 18   |November 20   |
