package ua.ithillel.homework.hw2.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeMain {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Employee member = createEmployee();

        System.out.println(member);

    }

    public static Employee createEmployee() throws IOException {

        System.out.println("Введите имя");
        String name = READER.readLine();
        System.out.println("Введите фамилию");
        String surname = READER.readLine();
        System.out.println("Введите должность");
        String position = READER.readLine();
        System.out.println("Введите email");
        String email = READER.readLine();
        long phoneNumber = Employee.correctPhoneNumber();
        ;
        System.out.println("Введите возраст");
        int age = Integer.parseInt(READER.readLine());
        return new Employee(name, surname, position, email, phoneNumber, age);

    }

}
