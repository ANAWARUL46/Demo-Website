Feature: BNSsignUP
  User wants to create new account in BNS webpage

  @BNSPOM
  Scenario: Creating account in BNS Sign Up page
    Given User is on BNS sign up page
    When User will enter "Anwar" in firstname textbox, "Islam" in lastname textbox, "Anwar@yahoo.com" in emil textbox,"1234" in password textbox, "911911911" in phone textbox
    And User will select "May" in month dropdown box, "10" in day dropdown box, "2001" in year dropdownbox
    And User will click "Male" in Gender radio button
    And User will click "Submit" in submit button
    Then User should see message "Submitted Form Data"
