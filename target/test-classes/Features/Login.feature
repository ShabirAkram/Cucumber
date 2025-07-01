Feature: Verifying OMR Login Module

  Scenario Outline: Login with valid credentials
    Given User is on the OMR page
    When User enters "<userName>" and "<password>"
    And User clicks the login button
    Then User should verify after login success message

    Examples: 
      | userName             | password    |
      | shabir4950@gmail.com | Shabir@4950 |
  #Scenario: Verifying Amazon Product Search
    #Given User is on the amazon page
    #When User search Product
      #| TV      |
      #| Laptop  |
      #| android |
      #| ios     |
    #Then User should verify same product listed
#
  #Scenario: Verifying Amazon Product Search
    #Given User is on the amazon page
    #When User search Product
      #| TV      | Sony      |
      #| Laptop  | Think pad |
      #| android | Samsung   |
      #| ios     | iphone    |
    #Then User should verify same product listed
