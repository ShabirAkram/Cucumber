Feature: Verifying fb Login

  Scenario: Verifying fb Login
    Given User is on the fb page
    When User Login
      | Bala | Sony@345        |
      | Mani | Thinkpag@6578   |
      | Abu  | Samsung@87      |
      | Guna | iphone@lknsf1ka |
    Then User should verify success message

  Scenario: Verifying fb Login
    Given User is on the fb page
    When User Login
      | name | password        |
      | Bala | Sony@345        |
      | Mani | Thinkpag@6578   |
      | Abu  | Samsung@87      |
      | Guna | iphone@lknsf1ka |
    Then User should verify success message
