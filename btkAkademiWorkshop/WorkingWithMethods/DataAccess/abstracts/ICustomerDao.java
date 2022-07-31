package WorkingWithMethods.DataAccess.abstracts;

import WorkingWithMethods.Entities.concrete.Customer;

public interface ICustomerDao {
    void add(Customer customer);
    boolean customerExists(Customer customer);
}
