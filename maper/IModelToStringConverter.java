package maper;

import model.Person;
import java.util.List;

public interface IModelToStringConverter {

    String convertPersonToString(Person person);
    List<Person> convertStringToPerson(String string);
}
