                            📱 ApiDemos Mobile Automation Project

Bu proje, Android platformunda Appium kullanılarak geliştirilmiş bir mobil test otomasyon projesidir.  
Android platformu, Android işletim sistemine sahip mobil cihazlarda (telefon, tablet) çalışan uygulamaları ifade eder. 
Test senaryoları BDD (Behavior Driven Development) yaklaşımı ile Cucumber kullanılarak yazılmıştır.

---

🚀 Kullanılan Teknolojiler

- Java
- Appium
- Selenium
- Cucumber (BDD)
- JUnit
- Maven

---

📂 Proje Yapısı

src
 └── test
     ├── java
     │    ├── stepdefinitions
     │    ├── utilities
     │    └── runners
     └── resources
          └── features



---


📌 Test Senaryoları

✅ US-01: Login
- Kullanıcı giriş işlemi doğrulanır

✅ US-02: Form Interaction
- Form elemanları ile etkileşim sağlanır

✅ US-03: Scroll ve Navigation
- Scroll işlemi ile "Animation" sayfası bulunur
- Hedef ekranın açıldığı doğrulanır

✅ US-04: Alert Dialog
- Alert dialog açılır
- Cancel ve OK aksiyonları test edilir
- Alert'in kapanması doğrulanır
- Aynı dialog'un tekrar açılabildiği kontrol edilir

---

 

 🔧 Kurulum

1. Projeyi klonla

git clone https://github.com/altunkaynakcenk-rgb/ApiDemos-Mobile-Automation.git

2. Proje klasörüne gir

cd ApiDemos-Mobile-Automation

3. Testleri çalıştır

mvn clean test

----


 2. Maven bağımlılıklarını yükle
    Gerekli dosyalar  https://mvnrepository.com/ adresindende alınabilir.


mvn clean install


---

 ▶️ Test Çalıştırma

mvn test


---

📊 Test Raporu

Test sonrası HTML rapor oluşturulur:


target/cucumber-report.html


---

 📸 Screenshot

- Test başarısız olduğunda otomatik screenshot alınır
- Rapor içerisinde görüntülenir

---
 ⚙️ Özellikler

- Page-independent reusable step yapısı
- Dynamic locator kullanımı
- Scroll işlemleri (UiScrollable)
- Alert handling (OK / Cancel)
- Hooks ile test lifecycle yönetimi
- Screenshot entegrasyonu
- HTML report

---

💡 Notlar

- Testler gerçek cihaz üzerinde çalıştırılmıştır
- USB Debugging açık olmalıdır
- Appium server aktif olmalıdır

---

👨‍💻 Geliştirici

Cenk Altunkaynak

---
