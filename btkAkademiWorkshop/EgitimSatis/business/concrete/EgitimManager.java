package EgitimSatis.business.concrete;

import EgitimSatis.business.abstracts.EgitimService;
import EgitimSatis.business.abstracts.KampanyaService;
import EgitimSatis.dataAccess.abstracts.IEgitimDao;
import EgitimSatis.entities.concrete.Egitim;

import java.util.ArrayList;
import java.util.List;

public class EgitimManager implements EgitimService {

    List<Egitim> egitimler = new ArrayList<>();
    IEgitimDao egitimDao;
    KampanyaService kampanyaService;

    public EgitimManager(IEgitimDao egitimDao,KampanyaService kampanyaService){
        this.egitimDao = egitimDao;
        this.kampanyaService = kampanyaService;
    }

    @Override
    public List<Egitim> listeleEgitimler() {

        List<Egitim> egitimler = egitimDao.listeleEgitimler();
        kampanyaService.fiyatGuncelle(egitimler);
        return  egitimler;
    }








}
