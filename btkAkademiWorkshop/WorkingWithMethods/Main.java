package WorkingWithMethods;

import WorkingWithMethods.Business.concrete.CustomerManager;
import WorkingWithMethods.Business.serviceAdapters.KpsServiceAdapter;
import WorkingWithMethods.DataAccess.concrete.CustomerDao;

public class Main {
    public static void main(String[] args) throws Exception {


        CustomerManager customerManager = new CustomerManager(new CustomerDao(),new KpsServiceAdapter());



    }
}



