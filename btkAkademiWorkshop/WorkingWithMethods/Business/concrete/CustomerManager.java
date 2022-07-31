package WorkingWithMethods.Business.concrete;

import WorkingWithMethods.DataAccess.abstracts.ICustomerDao;
import WorkingWithMethods.DataAccess.concrete.CustomerDao;
import WorkingWithMethods.Entities.concrete.Customer;
import WorkingWithMethods.Entities.concrete.Person;
import WorkingWithMethods.Business.abstracts.PersonService;

public class CustomerManager {

    //Bu desene Dependency Injection denir.

    ICustomerDao customerDao;
    PersonService personService;
    public CustomerManager(ICustomerDao _customerDao, PersonService personService){
        this.customerDao = _customerDao;
        this.personService = personService;
    }


//Müşteri eklemeye yarar.
    public void add(Customer customer) throws Exception {

        //Customer nesnesini Validator kullanarak doğrulama yapar.
        validateFirstNameIfEmpty(customer);
        validateLastNameIfEmpty(customer);


//Veritabanına ekliyoruz.
        customerDao.add(customer);



    }

    public void addByOtherBusiness(Customer customer) throws Exception {

        validateFirstNameIfEmpty(customer);
        validateLastNameIfEmpty(customer);
        validateFirstNameLength(customer);

        customerDao.add(customer);
    }



    private void validateFirstNameIfEmpty(Customer customer) throws Exception {

        if (customer.getFirstName().isEmpty()){
            throw new Exception("Validasyon hatası");
        }
    }

    private void validateLastNameIfEmpty(Customer customer) throws Exception {

        if (customer.getLastName().isEmpty()){
            throw new Exception("Validasyon hatası");
        }
    }

    private void validateIdentityNumberIfEmpty(Customer customer) throws Exception {

        if (customer.getIdentityNumber().isEmpty()){
            throw new Exception("Validasyon hatası");
        }
    }

    private void validateFirstNameLength(Customer customer) throws Exception {

        if (customer.getFirstName().length() < 2 ){
            throw new Exception("Validasyon hatası");
        }}


        private void checkCustomerExists(Customer customer){
            CustomerDao customerDao = new CustomerDao();
            if (customerDao.customerExists(customer)){

            }
        }

        private void checkPersonExists(Person person) throws Exception {
            if (!personService.checkPerson(person)){
                throw new Exception("Kişi bilgileri hatalı");

            }
        }


    }











































































