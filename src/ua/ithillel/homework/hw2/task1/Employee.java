package ua.ithillel.homework.hw2.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;

public class Employee {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    private String name;
    private String surname;
    private String position;
    private String email;
    private long phoneNumber;
    private int age;

    public Employee(String name, String surname, String position, String email, long phoneNumber, int age) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static long correctPhoneNumber() throws IOException {
        System.out.println("Введите номер телефона(формат: 380500000000)");
        long phoneNumber = Long.parseLong(READER.readLine());
        if (phoneNumber < 380000000000L || phoneNumber > 390000000000L) {
            System.out.println("phone number is incorrect");
            System.out.println("Try again");
            return correctPhoneNumber();
        } else {
            return phoneNumber;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return phoneNumber == employee.phoneNumber && Objects.equals(surname, employee.surname) && Objects.equals(position, employee.position) && Objects.equals(email, employee.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, position, email, phoneNumber);
    }

    @Override
    public String toString() {
        return "Employee: " + this.name + " " + this.surname + ", " + this.position;
    }
}
