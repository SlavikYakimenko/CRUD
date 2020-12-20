import executors.BinaryExecutor;
import executors.Executable;
import executors.impl.BasicFormatExecutor;
import maper.impl.JsonModelToStringConverter;
import maper.impl.XmlModelConverter;
import model.Person;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person mike = new Person(1, "Mike", "Alexendr", 24, "Kyiv");

        try {
            BinaryExecutor.write(mike);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
