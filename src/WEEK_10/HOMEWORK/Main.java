package WEEK_10.HOMEWORK;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        KutuphaneYoneticisi yonetici = new KutuphaneYoneticisi(1,"admin","admin","password");
        Yazar yazar = new Yazar(1, "Ahmet Ümit");
        Kitap kitap1 = new Kitap(101, "Beyoğlu'nun En Güzel Abisi", yazar);
        Kitap kitap2 = new Kitap(102, "Kırlangıç Çığlığı", yazar);
        Kullanici kullanici1 = new Kullanici(201, "Elif", "elif123", "sifre123");

        yonetici.kitapEkle(kitap1);
        yonetici.kitapEkle(kitap2);

        yonetici.kitapOduncAl(kullanici1, kitap1);
        System.out.println("Kullanici1'in ödünç aldığı kitaplar: " + kullanici1.getOduncAlinanKitaplar());

        yonetici.kitapOduncAl(kullanici1,kitap2);
        System.out.println("Kullanici1'in ödünç aldığı kitaplar: " + kullanici1.getOduncAlinanKitaplar());

        for (OduncAlinanKitap oduncKitap : kullanici1.getOduncAlinanKitaplar()) {
            System.out.println("Kitap: " + oduncKitap.getKitap().getIsim() +
                    ", Ödünç Alma Tarihi: " + oduncKitap.getOduncAlmaTarihi());
        }

        yonetici.kitapIadeEt(kullanici1, kitap1);

        for (OduncAlinanKitap oduncKitap : kullanici1.getOduncAlinanKitaplar()) {
            if (oduncKitap.getIadeTarihi() != null) {
                System.out.println("Kitap: " + oduncKitap.getKitap().getIsim() +
                        ", İade Tarihi: " + oduncKitap.getIadeTarihi());
            }
        }

        System.out.println("Kullanici1'in iade ettikten sonra kitapları: " + kullanici1.getOduncAlinanKitaplar());

    }
}
