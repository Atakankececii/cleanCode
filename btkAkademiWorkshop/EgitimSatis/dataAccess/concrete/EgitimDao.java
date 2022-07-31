package EgitimSatis.dataAccess.concrete;

import EgitimSatis.dataAccess.abstracts.IEgitimDao;
import EgitimSatis.entities.concrete.Egitim;

import java.util.ArrayList;
import java.util.List;

public class EgitimDao implements IEgitimDao {


    List<Egitim> egitimler = new ArrayList<>();

    @Override
    public List<Egitim> listeleEgitimler() {
        return egitimler;
    }


}
