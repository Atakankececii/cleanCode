package EgitimSatis.dataAccess.abstracts;

import EgitimSatis.entities.concrete.Egitim;

import java.util.List;

public interface IEgitimDao {
    List<Egitim> listeleEgitimler();
}
