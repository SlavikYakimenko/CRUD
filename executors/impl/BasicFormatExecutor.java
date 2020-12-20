package executors.impl;

import executors.Executable;
import maper.IModelToStringConverter;
import model.Person;
import utils.FileHelper;

import java.io.IOException;
import java.util.List;

public class BasicFormatExecutor implements Executable {

    private final FileHelper fileHelper;
    private final IModelToStringConverter converter;

    public BasicFormatExecutor(IModelToStringConverter converter) {
        this.fileHelper = new FileHelper();
        this.converter = converter;
    }

    @Override
    public void write(Person person) throws IOException {
        String personStr = converter.convertPersonToString(person);
        fileHelper.saveToFile("person.bin", personStr);
    }

    @Override
    public List<Person> read() throws IOException, ClassNotFoundException {
        String content = fileHelper.readFromFile("person.bin");
        return converter.convertStringToPerson(content);
    }

    @Override
    public boolean update(Person person) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
