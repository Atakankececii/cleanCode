package WorkingWithMethods.DataAccess.concrete;

import WorkingWithMethods.DataAccess.abstracts.ICustomerDao;
import WorkingWithMethods.Entities.concrete.Customer;

public class CustomerDao2 implements ICustomerDao {

    @Override
    public void add(Customer customer) {

    }

    @Override
    public boolean customerExists(Customer customer) {
        return false;
    }
}
