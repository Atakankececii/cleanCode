package EgitimSatis.business.concrete;

import EgitimSatis.business.abstracts.KampanyaService;
import EgitimSatis.entities.concrete.Egitim;

import java.util.List;

public class StandartFiyatKampanyaManager implements KampanyaService {
    @Override
    public void fiyatGuncelle(List<Egitim> egitimler) {

        for (Egitim egitim:egitimler
             ) {
            egitim.setFiyat(guncelTabanFiyatiGetir());
        }
    }
    private double guncelTabanFiyatiGetir() {
        //veri tabanına bağlan ve o fiyatı çek
        return 25;
    }

}
