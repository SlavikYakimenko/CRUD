package executors;

import model.Person;

import java.io.*;
import java.util.List;


public class BinaryExecutor implements Executable {

    @Override
    public static void write(Person person) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.bin"))) {
            oos.writeObject(person);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<Person> read() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.bin"))) {
            Person person = (Person) ois.readObject();
            System.out.printf("Name: %s \t Age: %d \n", person.getFirstName(), person.getAge());
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
        return null;
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

//@Override
//public boolean update(Person person){
//        return false;
//        }
//
//@Override
//public boolean delete(int id){
//        return false;
//        }
//        }
