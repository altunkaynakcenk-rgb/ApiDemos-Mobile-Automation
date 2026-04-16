Feature: Placeholder Test (Temp)

  Scenario: Input alaninda placeholder ve yazi testi

    Given kullanici uygulamayi acar
    When kullanici Views menusune gider
    And kullanici Controls menusune gider
    And kullanici Light Theme ekranini acar

    Then kullanici placeholder oldugunu gorur
    And kullanici input alanina "Test123" yazar
    Then kullanici yazdigi degeri dogrular