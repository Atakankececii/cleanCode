package WorkingWithMethods.DataAccess.abstracts;

import WorkingWithMethods.Entities.concrete.Product;

import java.util.List;

public interface IProductDao {
    List<Product> getAll();
}
