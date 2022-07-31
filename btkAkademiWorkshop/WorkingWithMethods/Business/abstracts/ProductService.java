package WorkingWithMethods.Business.abstracts;

import WorkingWithMethods.Entities.concrete.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
