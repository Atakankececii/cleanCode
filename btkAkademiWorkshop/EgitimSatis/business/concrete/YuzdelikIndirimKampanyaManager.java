package EgitimSatis.business.concrete;

import EgitimSatis.business.abstracts.KampanyaService;
import EgitimSatis.entities.concrete.Egitim;

import java.util.List;

public class YuzdelikIndirimKampanyaManager implements KampanyaService {
    @Override
    public void fiyatGuncelle(List<Egitim> egitimler) {
        for (Egitim egitim: egitimler
             ) {
            egitim.setFiyat(egitim.getFiyat() - (egitim.getFiyat()*yuzdelikIndirimiGetir()));


        }
    }
    private double yuzdelikIndirimiGetir() {
        return 0.9;
    }
}
