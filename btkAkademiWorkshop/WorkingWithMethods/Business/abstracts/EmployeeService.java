package WorkingWithMethods.Business.abstracts;

import WorkingWithMethods.Entities.concrete.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
}
