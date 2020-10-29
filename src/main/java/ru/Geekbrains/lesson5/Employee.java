package ru.Geekbrains.lesson5;

import java.util.Scanner;

public class Employee {
    String fio;
    String profession;
    String email;
    long Telephone;
    long Salary;
    int age;

    public Employee(String fio, String profession, String email, long telephone, long salary, int age) {
        this.fio = fio;
        this.profession = profession;
        this.email = email;
        Telephone = telephone;
        Salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void printInfo(){
        System.out.println("fio "+fio+ " Profession "+profession+ " email "+email+ " Tel "+Telephone+ " Salary "+Salary+ " age "+age);
    }
    void GetData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\tEnter Employee Name : ");
        fio = sc.nextLine();

        System.out.print("\n\tEnter Employee Profession : ");
        profession = sc.nextLine();

        System.out.print("\n\tEnter Employee email : ");
        email = sc.nextLine();

        System.out.print("\n\tEnter Employee Telephone : ");
        Telephone = Long.parseLong(sc.nextLine());

        System.out.print("\n\tEnter Employee Salary : ");
        Salary = Long.parseLong(sc.nextLine());

        System.out.print("\n\tEnter Employee Age : ");
        age = Integer.parseInt(sc.nextLine());
    }

    void PutData() {
        System.out.print("\n\tEmployee Name : " + fio);
        System.out.print("\n\tEmployee Profession : " + profession);
        System.out.print("\n\tEmployee email : " + email);
        System.out.print("\n\tEmployee Telephone : " + Telephone);
        System.out.print("\n\tEmployee Salary : " + Salary);
        System.out.print("\n\tEmployee Age : " + age);
    }
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("ivan ivanov1", "Engineer", "ivanov@mailbox.com", 567568568, 120000, 36);
        employees[1] = new Employee("ivan ivanov2", "Actor", "banderaspapandreas@mail.ru", 894438928, 100000, 50);
        employees[2] = new Employee("ivan ivanov3", "Actor", "ChuckFu@yandex.ru", 856756755, 2000000, 78);
        employees[3] = new Employee("ivan ivanov4", "Actor", "RamboForeva@gmail.com", 858585858, 1000000, 68);
        employees[4] = new Employee("ivan ivanov5", "Actor", "janenegr@dmx.de", 453222534, 2500000, 22);
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }
    }
}
