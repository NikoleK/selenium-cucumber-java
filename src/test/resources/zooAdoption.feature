Feature: Zoo Adoption

  Background:
    Given Open url "http://www.thetestroom.com/jswebapp/index.html"

  Scenario: name displaying
    When I fill field of first page with "my name"
    Then "my name" displayed below the text enter field

  Scenario Outline: confirmation text matching on last page
    Given I fill field of first page with "my name"
    And I click continue button on first page
    And I select "Nemo the Fish" from drop down
    When I click continue button on second page
    Then displayed text equals to the <expected>

  Examples:
  | expected |
  |"Thank you for your selection. Your animal adoption papers will be sent to you shortly with a lovely card from your selected animal."|

  Scenario Outline: adopting after adopting
    Given I fill field of first page with "my name"
    And I click continue button on first page
    And I select "Nemo the Fish" from drop down
    And I click continue button on second page
    And displayed text equals to the <expected>
    And I click home button on final page
    And I fill field of first page with "my name"
    And I click continue button on first page
    And I select <another pet> from drop down
    When I click continue button on second page
    Then displayed text equals to the <expected>

  Examples:
  | another pet | expected|
  | "Simba the Lion" |"Thank you for your selection. Your animal adoption papers will be sent to you shortly with a lovely card from your selected animal."|
  | "George the Turtle" |"Thank you for your selection. Your animal adoption papers will be sent to you shortly with a lovely card from your selected animal."|

  Scenario: adopting without a name is not enable
    Then continue button disabled