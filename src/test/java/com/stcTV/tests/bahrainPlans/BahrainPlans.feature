Feature: Check Type, Price and Currency for Bahrain Country

  Scenario Outline: Validate Type, Price and Currency for Lite Plan
    Given website is opened
    When click on arrow button in home page
    And click on Bahrain country in popUp
    Then country Name "<countryName>" should be displayed in home page
    And plan type should be lite "<planType>" in home page
    And price of lite plan should be "<planPrice>" in home page
    And currency should be "<currency>" in home page
    Examples:
      | countryName | planType  | planPrice | currency |
      | Bahrain     | LITE      | 2         | BHD      |

  Scenario Outline: Validate Type, Price and Currency for Classic Plan
    Given website is opened
    When click on arrow button in home page
    And click on Bahrain country in popUp
    Then country Name "<countryName>" should be displayed in home page
    And plan type should be classic "<planType>" in home page
    And price of classic plan should be "<planPrice>" in home page
    And currency should be "<currency>" in home page
    Examples:
      | countryName     | planType   | planPrice | currency |
      | Bahrain         | CLASSIC    | 3        | BHD      |

  Scenario Outline: Validate Type, Price and Currency for Premium Plan
    Given website is opened
    When click on arrow button in home page
    And click on Bahrain country in popUp
    Then country Name "<countryName>" should be displayed in home page
    And plan type should be premium "<planType>" in home page
    And price of premium plan should be "<planPrice>" in home page
    And currency should be "<currency>" in home page
    Examples:
      | countryName     | planType   | planPrice | currency |
      | Bahrain         | PREMIUM    | 6        | BHD      |