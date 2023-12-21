package WEEK_10.HOMEWORK;

public class Kitap {
    private int id;
    private String isim;
    private Yazar yazar;

    // Getter ve Setter metodları

    public Kitap(int id, String isim, Yazar yazar){
        this.id = id;
        this.isim = isim;
        this.yazar = yazar;
        yazar.eserEkle(this);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Yazar getYazar() {
        return yazar;
    }

    public void setYazar(Yazar yazar) {
        this.yazar = yazar;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", yazar=" + yazar.getIsim() + //
                '}';
    }
}
