package executors;

import model.Person;

import java.io.IOException;
import java.util.List;

public interface Executable {
    void write(Person person) throws IOException; // create
    List<Person> read() throws IOException, ClassNotFoundException;
    boolean update(Person person);
    boolean delete(int id);
}