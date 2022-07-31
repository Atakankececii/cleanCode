package EgitimSatis.entities.concrete;

import EgitimSatis.entities.abstracts.Entity;

public class Egitim implements Entity {

    private int id;
    private String ad;
    private double fiyat;

    public Egitim() {
    }

    public Egitim(int id, String ad, double fiyat) {
        this.id = id;
        this.ad = ad;
        this.fiyat = fiyat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
}
