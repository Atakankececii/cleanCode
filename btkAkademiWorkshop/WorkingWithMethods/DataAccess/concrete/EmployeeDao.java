package WorkingWithMethods.DataAccess.concrete;

import WorkingWithMethods.DataAccess.abstracts.IEmployeeDao;
import WorkingWithMethods.Entities.concrete.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao implements IEmployeeDao {

    @Override
    public List<Employee> getAll() {

        return new ArrayList<Employee>(){

        };
    }
}
