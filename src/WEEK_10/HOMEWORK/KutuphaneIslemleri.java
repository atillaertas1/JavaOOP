package WEEK_10.HOMEWORK;

public interface KutuphaneIslemleri {
    void kitapOduncAl(Kullanici kullanici, Kitap kitap);
    void kitapIadeEt(Kullanici kullanici, Kitap kitap);
    Kitap kitapAra(String kitapAdi);
}