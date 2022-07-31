package WorkingWithMethods.DataAccess.abstracts;

import WorkingWithMethods.Entities.concrete.Employee;

import java.util.List;

public interface IEmployeeDao {
    List<Employee> getAll();
}
