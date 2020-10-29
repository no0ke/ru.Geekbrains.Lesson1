package ru.Geekbrains.lesson5;

public class HomeWork5 {

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