package WorkingWithMethods.DataAccess.concrete;

import WorkingWithMethods.DataAccess.abstracts.IProductDao;
import WorkingWithMethods.Entities.concrete.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao implements IProductDao {

    List<Product> products = new ArrayList<>();
    @Override
    public List<Product> getAll() {
        return products;
    }
}
