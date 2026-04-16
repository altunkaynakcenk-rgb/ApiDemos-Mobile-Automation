Feature: Scroll and Navigation

  Scenario: Kullanici scroll islemi ile elementi bulur ve detay ekranini acar

    Given kullanici uygulamayi acar
    When kullanici Viewes menusune gider
    And us03 kullanici "Animation" ekranina gider
    And detay ekrani goruntulenmelidir
