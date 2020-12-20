package maper.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import maper.IModelToStringConverter;
import model.Person;

import java.io.IOException;
import java.util.List;

public class JsonModelToStringConverter implements IModelToStringConverter {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertPersonToString(Person person) {
        try {
            return objectMapper.writeValueAsString(person);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e); // СПРОСИТЬ ПРО НУЖНЫЙ ЭКСЕПШЕН
        }
    }

    @Override
    public List<Person> convertStringToPerson(String string) {
        try {
            return objectMapper.readValue(string, new TypeReference<List<Person>>(){});
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e); // СПРОСИТЬ ПРО НУЖНЫЙ ЭКСЕПШЕН
        }
    }
}
