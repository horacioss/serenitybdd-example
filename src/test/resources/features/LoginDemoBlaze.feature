@Login
Feature: Login into DemoBlaze Store App

  Scenario Outline: Login
    Given Mike is in the DemoBlaze home page
    When input his username: "<Username>" and his password: "<Password>"
    Then he should can see the welcome message: "Welcome <Username>" in the navigation bar
    Examples:
    | Username   | Password   |
    | horacioss4 | 1234567890 |