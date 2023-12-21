package WEEK_10.HOMEWORK;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class KutuphaneYoneticisi extends Kullanici implements KutuphaneIslemleri {
    private List<Kitap> kitaplar = new ArrayList<>();
    private List<Kullanici> kullanicilar = new ArrayList<>();

    public KutuphaneYoneticisi(int id, String isim, String kullaniciAdi, String sifre) {
        super(id, isim, kullaniciAdi, sifre);
    }

    @Override
    public void kitapOduncAl(Kullanici kullanici, Kitap kitap) {
        // Ödünç alma işlemleri
        // Örnek olarak basit bir kontrol ekledim
        if (!kullanici.getOduncAlinanKitaplar().contains(kitap) && kitaplar.contains(kitap)) {
            kullanici.kitapOduncAl(kitap);
            kitaplar.remove(kitap);
        }
    }

    @Override
    public void kitapIadeEt(Kullanici kullanici, Kitap kitap) {
        for (OduncAlinanKitap oduncKitap : kullanici.getOduncAlinanKitaplar()) {
            if (oduncKitap.getKitap().equals(kitap)) {
                oduncKitap.setIadeTarihi(LocalDate.now()); // İade tarihini ayarla
                kitaplar.add(kitap);
                return;
            }
        }
    }

    @Override
    public Kitap kitapAra(String kitapAdi) {
        for (Kitap kitap : kitaplar) {
            if (kitap.getIsim().equalsIgnoreCase(kitapAdi)) {
                return kitap;
            }
        }
        return null;
    }

    public void kitapEkle(Kitap kitap) {
        kitaplar.add(kitap);
    }

    public void kullaniciEkle(Kullanici kullanici) {
        kullanicilar.add(kullanici);
    }
}
