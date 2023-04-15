Feature: Cash Withdrawal
  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited <number> in my wallet
    When I request <Withdraw>
    Then should be dispensed
    Examples:
      |number |Withdraw |
      |200    |100      |
      |600    |600      |
      |0      |0        |
      |2000   |1500     |