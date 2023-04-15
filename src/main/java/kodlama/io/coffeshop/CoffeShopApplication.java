package kodlama.io.coffeshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*Startbucks için program yazacağız.
Sisteme müşteriler kayıt olabilmelidir.
Kayıt olurken müşteriden ad,soyad,doğum yılı, tcno bilgilerini istiyoruz.
Fakat bu kullanıcıdının gerçek kişi olması starbucks için önemli.
Kayıt etmeden önce Edevlet üzerinden bu kişinin doğruluğunu kontrol etmek istiyor.
Edevlet true dönerse sisteme kayıt gerçekleşir.
Edevlet sistemleri verdiğiniz dört bilgiye sahip bir kişi varsa true döner*/
@SpringBootApplication
public class CoffeShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoffeShopApplication.class, args);
    }

}
