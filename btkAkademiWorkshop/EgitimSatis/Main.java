package EgitimSatis;

import EgitimSatis.business.abstracts.EgitimService;
import EgitimSatis.business.concrete.EgitimManager;
import EgitimSatis.business.concrete.StandartFiyatKampanyaManager;
import EgitimSatis.dataAccess.concrete.EgitimDao;

public class Main {
    public static void main(String[] args){

        EgitimManager egitimManager = new EgitimManager(new EgitimDao(),new StandartFiyatKampanyaManager());
        egitimManager.listeleEgitimler();


    }
}
