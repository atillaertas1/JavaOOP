package WEEK_10.HOMEWORK;

import java.util.ArrayList;
import java.time.LocalDate;

public class Kullanici extends Kisi {
    private String kullaniciAdi;
    private String sifre;
    private ArrayList<OduncAlinanKitap> oduncAlinanKitaplar; // OduncAlinanKitap nesnelerini saklamak için güncellendi

    public Kullanici(int id, String isim, String kullaniciAdi, String sifre) {
        super(id, isim); // Kisi sınıfının id ve isim ile bir constructor'ı olduğunu varsayıyorum
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.oduncAlinanKitaplar = new ArrayList<>();
    }

    // Kitap ödünç alma ve iade etme metodları
    void kitapOduncAl(Kitap kitap) {
        OduncAlinanKitap oduncKitap = new OduncAlinanKitap(kitap, this, LocalDate.now());
        oduncAlinanKitaplar.add(oduncKitap);
    }

    void kitapIadeEt(Kitap kitap) {
        for (OduncAlinanKitap oduncKitap : oduncAlinanKitaplar) {
            if (oduncKitap.getKitap().equals(kitap)) {
                oduncKitap.setIadeTarihi(LocalDate.now());
                break;
            }
        }
    }

    // Ödünç alınan kitapların listesini döndürme
    public ArrayList<OduncAlinanKitap> getOduncAlinanKitaplar() {
        return oduncAlinanKitaplar;
    }

    // Kullanıcı bilgilerini güncelleme
    public void bilgileriGuncelle(String yeniIsim, String yeniKullaniciAdi, String yeniSifre) {
        this.isim = yeniIsim;
        this.kullaniciAdi = yeniKullaniciAdi;
        this.sifre = yeniSifre;
    }

    // Getter ve Setter metodları
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    // toString metodu, nesne bilgilerini string olarak döndürür
    @Override
    public String toString() {
        return "Kullanici{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", kullaniciAdi='" + kullaniciAdi + '\'' +
                ", sifre='" + sifre + '\'' +
                ", oduncAlinanKitaplar=" + oduncAlinanKitaplar +
                '}';
    }
}
