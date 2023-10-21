Feature: Check Type, Price and Currency for KSA Country

  Scenario Outline: Validate Type, Price and Currency for Lite
    Given website is opened
    Then country Name "<countryName>" should be displayed in home page
    And plan type should be lite "<planType>" in home page
    And price of lite plan should be "<planPrice>" in home page
    And currency should be "<currency>" in home page
    Examples:
      | countryName | planType | planPrice | currency |
      | KSA         | LITE     | 15        | SAR      |

  Scenario Outline: Validate Type, Price and Currency for Classic
    Given website is opened
    Then country Name "<countryName>" should be displayed in home page
    And plan type should be classic "<planType>" in home page
    And price of classic plan should be "<planPrice>" in home page
    And currency should be "<currency>" in home page
    Examples:
      | countryName | planType | planPrice | currency |
      | KSA         | CLASSIC  | 25        | SAR      |

  Scenario Outline: Validate Type, Price and Currency for Premium
    Given website is opened
    Then country Name "<countryName>" should be displayed in home page
    And plan type should be premium "<planType>" in home page
    And price of premium plan should be "<planPrice>" in home page
    And currency should be "<currency>" in home page
    Examples:
      | countryName | planType | planPrice | currency |
      | KSA         | PREMIUM  | 60        | SAR      |