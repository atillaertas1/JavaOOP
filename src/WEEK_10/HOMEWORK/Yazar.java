package WEEK_10.HOMEWORK;

import java.util.ArrayList;
import java.util.List;

public class Yazar extends Kisi {
    private List<Kitap> eserler;

    public Yazar(int id, String isim) {
        super(id,isim);
        this.eserler = new ArrayList<>();
    }

    // Diğer metodlar ve getter/setter'lar aynı kalabilir


    // Yazarın eserlerini ekleyen metod
    public void eserEkle(Kitap kitap) {
        eserler.add(kitap);
    }

    // Yazarın eserlerini kaldıran metod
    public void eserCikar(Kitap kitap) {
        eserler.remove(kitap);
    }

    // Yazarın tüm eserlerini döndüren metod
    public List<Kitap> getEserler() {
        return eserler;
    }

    // Yazarın bilgilerini güncelleyen metod
    public void bilgileriGuncelle(int yeniId, String yeniIsim) {
        this.id = yeniId;
        this.isim = yeniIsim;
    }

    // Yazarın bilgilerini döndüren toString metodu
    @Override
    public String toString() {
        return "Yazar{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", eserler=" + eserler.toString() +
                '}';
    }
}
