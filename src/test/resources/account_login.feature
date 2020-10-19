Feature: Account login

  Scenario: Successfully login an account when the password is correct
    Given Account with a password of "test123"
    When Trying to login with password "test123"
    Then Account is logged in "true"

  Scenario: Unsuccessfully login an account when the password is wrong
    Given Account with a password of "test123"
    When Trying to login with password "test456"
    Then Account is logged in "false"

  Scenario: Successfully change password an account when the old password is correct
    Given Account with a password of "test123"
    When Trying to change password for "test123" to "aninfo"
    Then Account password is "aninfo"

  Scenario: Unsuccessfully change password an account when the old password is wrong
    Given Account with a password of "aninfo"
    When Trying to change password for "psa" to "FIUBA"
    Then Account password is "aninfo"