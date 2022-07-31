package WorkingWithMethods.Business.serviceAdapters;

import WorkingWithMethods.Business.abstracts.PersonService;
import WorkingWithMethods.Entities.concrete.Person;
import WorkingWithMethods.KpsService;

public class KpsServiceAdapter implements PersonService {

    @Override
    public boolean checkPerson(Person person) {
        KpsService kpsService = new KpsService();
        return kpsService.checkPerson(person.getIdentityNumber(),person.getFirstName(),person.getLastName(),person.getYearOfBirth());
    }
}
