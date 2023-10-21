Feature: Check Type, Price and Currency for Kuwait Country

  Scenario Outline: Validate Type, Price and Currency for Lite Plan.
    Given website is opened
    When click on arrow button in home page
    And click on Kuwait country in popUp
    Then country Name "<countryName>" should be displayed in home page
    And plan type should be lite "<planType>" in home page
    And price of lite plan should be "<planPrice>" in home page
    And currency should be "<currency>" in home page
    Examples:
      | countryName | planType  | planPrice | currency |
      | Kuwait     | LITE      | 1.2        | KWD      |

  Scenario Outline: Validate Type, Price and Currency for Classic Plan.
    Given website is opened
    When click on arrow button in home page
    And click on Kuwait country in popUp
    Then country Name "<countryName>" should be displayed in home page
    And plan type should be classic "<planType>" in home page
    And price of classic plan should be "<planPrice>" in home page
    And currency should be "<currency>" in home page
    Examples:
      | countryName | planType     | planPrice | currency |
      | Kuwait      | CLASSIC      | 2.5       | KWD      |

  Scenario Outline: Validate Type, Price and Currency for Premium Plan.
    Given website is opened
    When click on arrow button in home page
    And click on Kuwait country in popUp
    Then country Name "<countryName>" should be displayed in home page
    And plan type should be premium "<planType>" in home page
    And price of premium plan should be "<planPrice>" in home page
    And currency should be "<currency>" in home page
    Examples:
      | countryName  | planType | planPrice | currency |
      | Kuwait      | PREMIUM   | 4.8       | KWD      |