package WEEK_10.HOMEWORK;

import java.time.LocalDate;

public class OduncAlinanKitap {
    private Kitap kitap;
    private Kullanici kullanici;
    private LocalDate oduncAlmaTarihi;
    private LocalDate iadeTarihi; // İade tarihi için eklenen alan

    // Constructor
    public OduncAlinanKitap(Kitap kitap, Kullanici kullanici, LocalDate oduncAlmaTarihi) {
        this.kitap = kitap;
        this.kullanici = kullanici;
        this.oduncAlmaTarihi = oduncAlmaTarihi;
        this.iadeTarihi = null; // Başlangıçta null, iade sırasında ayarlanacak
    }

    public LocalDate getIadeTarihi() {
        return iadeTarihi;
    }

    public void setIadeTarihi(LocalDate iadeTarihi) {
        this.iadeTarihi = iadeTarihi;
    }

    public Kitap getKitap() {
        return kitap;
    }

    public void setKitap(Kitap kitap) {
        this.kitap = kitap;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public LocalDate getOduncAlmaTarihi() {
        return oduncAlmaTarihi;
    }

    public void setOduncAlmaTarihi(LocalDate oduncAlmaTarihi) {
        this.oduncAlmaTarihi = oduncAlmaTarihi;
    }

    @Override
    public String toString() {
        return "OduncAlinanKitap{" +
                "kitap=" + kitap.getIsim() +
                ", kullanici=" + kullanici.getKullaniciAdi() +
                ", oduncAlmaTarihi=" + oduncAlmaTarihi +
                ", iadeTarihi=" + (iadeTarihi != null ? iadeTarihi : "Henüz iade edilmedi") +
                '}';
    }
}
