Feature: Form Interaction

  Scenario: Kullanici form elemanlari ile etkilesim kurar

    Given kullanici uygulamayi acar
    When kullanici Views menusune gider
    And kullanici Controls menusune gider
    And kullanici Light Theme ekranini acar
    And kullanici input alanina "Test" yazar
    And kullanici checkbox secer
    Then checkbox secili olmalidir