package WEEK_10.HOMEWORK;

abstract class Kisi {
    protected String isim;
    protected int id;

    public Kisi(int id, String isim){
        this.id = id;
        this.isim = isim;
    }

    // Getter ve Setter metodları
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
