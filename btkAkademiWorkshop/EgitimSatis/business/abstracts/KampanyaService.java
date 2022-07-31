package EgitimSatis.business.abstracts;

import EgitimSatis.entities.concrete.Egitim;

import java.util.List;

public interface KampanyaService {
   void fiyatGuncelle(List<Egitim> egitimler);
}
