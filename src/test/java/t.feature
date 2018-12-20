# new feature
# Tags: optional

Feature:  validate registration

  Scenario: validate purchase
    Given Iam on home page
    When enter clothing in search bar
    And click search
    And hover on new
    And click jeans
    And click new look jeans
    And add to basket
    And cick proceed to checkout
    And enter email
    And enter password
    And click sign in
    Then validate purchase