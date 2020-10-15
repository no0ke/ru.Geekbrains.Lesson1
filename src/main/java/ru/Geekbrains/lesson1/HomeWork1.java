package ru.Geekbrains.lesson1;
/*
1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
*/
public class HomeWork1 {
    public static void main(String[] args) {
         System.out.println("\nЗадание 1 и 2.");
    int a = 9;
    long b = 8L;
    byte c = 4;
    short d = 7;
    double e = 0.156;
    float f = 0.364f;
    boolean g = true;
    char h = '#';
        System.out.println("Значение типа int = " + a);
        System.out.println("Значение типа long = " + b);
        System.out.println("Значение типа byte = " + c);
        System.out.println("Значение типа short = " + d);
        System.out.println("Значение типа double = " + e);
        System.out.println("Значение типа float = " + f);
        System.out.println("Значение типа boolean = " + g);
        System.out.println("Значение типа char = [" + h + "]");
    String str = "Как то так)";
        System.out.println("Значение типа string = " + str);
    }
    public static double Three(double a,double b,double c,double d) {
        System.out.println("\nЗадание 3.");
        return a * (b + (c / d));
    }
    public static boolean Four (int a, int b) {
        System.out.println("\nЗадание 4.");
        int x = a + b;
        if (x > 10 && x < 20) return true;
        else return false;
    }
   public static void Five(int a) {
        System.out.println("\nЗадание 5.");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }
    public static boolean Six(int a) {
        System.out.println("\nЗадание 6.");
        if (a < 0) return true;
        return false;
    }
    public static void Seven(String name) {
        System.out.println("\nЗадание 7.");
        System.out.println("Привет, " + name + "!");
    }
    static void Eaght(int year) {
        System.out.println("\nЗадание 7.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }
}

