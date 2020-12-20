package maper.impl;

import maper.IModelToStringConverter;
import model.Person;

import java.util.List;

public class XmlModelConverter implements IModelToStringConverter {
    @Override
    public String convertPersonToString(Person person) {
        return null;
    }

    @Override
    public List<Person> convertStringToPerson(String string) {
        return null;
    }
}
