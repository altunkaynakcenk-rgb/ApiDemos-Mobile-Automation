Feature: Alert Dialog Handling

  Scenario: Cancel sonra OK ayni dialog tekrar acilabilir
    When kullanici App menusune gider
    And kullanici "Alert Dialogs" ekranina gider

    And kullanici alerti acan butona tiklar
    Then alert goruntulenmelidir
    And kullanici "Cancel" butonuna tiklar
    Then alert kapanmis olmalidir

    And kullanici alerti acan butona tiklar
    Then alert goruntulenmelidir
    And kullanici "OK" butonuna tiklar
    Then alert kapanmis olmalidir

    Then ayni ekranda kalindigi dogrulanmalidir