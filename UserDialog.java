import model.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserDialog {

    public void startApp() {
        System.out.println("Выберете формат файла:");
        Scanner scanner = new Scanner(System.in);
        String format = scanner.nextLine(); // binary
        switch (format) {
            case "binary":
//                executor = new executors.BinaryExecutor();
                break;
            case "json":
//                executor = new JsonExecutor();
                break;
            default:
                System.out.println("неправильно введен формат");
                System.exit(0);
        }
        String personData = scanner.nextLine(); // 1 Vasya Pupkin 23 Ganduras
        String[] array = personData.split(" ");
        Person userPerson = new Person(Integer.parseInt(array[0]), array[1], array[2], Integer.parseInt(array[3]), array[4]);
//        executor.write(userPerson);
//        List<Person> persons = executor.read();
//        for (Person person : persons) {
//            System.out.println(person.toString());
    }


    public void start(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cmd = scanner.nextLine();
        switch (cmd) {
            case "create":
                break;
            case "read":
                break;
            case "update":
                ;
            case "delete":
                break;
        }

    }


    public void exit() throws IOException {
        while (true) {
            System.out.println("Are you sure that you want to quit the app?");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String answer = reader.readLine();
            if (answer.toLowerCase().equals("yes")) System.exit(0);
            else if (!answer.toLowerCase().equals("no")) System.out.println("Please answer \"yes\" or \"no\"");
            else break;
        }
    }

    public void help() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.println("Please, enter a number of the option you need a help with: \n 1 - how to exit an app \n 2 - how to generate a random number \n 3 - generate a random number from different range \n 4 - exit help section");
                String answer = reader.readLine();
                if (!answer.equals("1") && !answer.equals("2") && !answer.equals("3") && !answer.equals("4")) {
                    throw new IllegalArgumentException("Please, enter digits 1, 2, 3 or 4.");
                }
                int answerInt = Integer.parseInt(answer);
                if (answerInt == 1) {
                    System.out.println("In order to exit an app you need to go back to main menu and choose an exit option by entering \"exit\".\n");
                    break;
                } else if (answerInt == 2) {
                    System.out.println("In order to generate a random number between the minimum and maximum values you've entered you need to go back to the main menu and choose a generate option by entering \"generate\".\n");
                } else if (answerInt == 3) {
                    System.out.println("In order to generate a random number from a different range you need to exit an app and run it again.\n");
                } else if (answerInt == 4) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

