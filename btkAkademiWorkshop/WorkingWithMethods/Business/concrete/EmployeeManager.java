package WorkingWithMethods.Business.concrete;

import WorkingWithMethods.Business.abstracts.EmployeeService;
import WorkingWithMethods.DataAccess.abstracts.IEmployeeDao;
import WorkingWithMethods.Entities.concrete.Employee;

import java.util.List;

public class EmployeeManager implements EmployeeService {
   IEmployeeDao employeeDao;

   public EmployeeManager(IEmployeeDao employeeDao){
       this.employeeDao = employeeDao;
   }


    @Override
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }
}
