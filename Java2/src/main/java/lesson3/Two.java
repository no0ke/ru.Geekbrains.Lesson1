package lesson3;

import java.util.*;

class Phonebook {

    private final HashMap<String, List<String>> book;

    public Phonebook(){
        this.book = new HashMap<>();
    }

    public void add(String surname, String number){
        if(book.containsKey(surname)){
            List<String> numbers = book.get(surname);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.printf("Номер %s добавлен для фамилии %s%n", number, surname);
            } else {
                System.out.printf("Номер %s уже существует для фамилии %s%n", number, surname);
            }
        } else {
            book.put(surname, new ArrayList<>(Collections.singletonList(number)));
            System.out.printf("Номер %s добавлен для фамилии %s%n", number, surname);
        }
    }

    public List<String> get(String surname){
        if(book.containsKey(surname)){
            return book.get(surname);
        } else {
            System.out.printf("В справочнике нет записи для фамилии %s%n", surname);
            return new ArrayList<>();
        }
    }
}
public class Two {
    public static void main(String[] args){
        System.out.println("Создаем справочник");
        Phonebook phonebook = new Phonebook();
        System.out.println("-----------------");

        System.out.println("Наполняем справочник");
        phonebook.add("Иванов", "223344");
        phonebook.add("Иванов", "22334411");
        phonebook.add("Петров", "22334499");
        phonebook.add("Сидоров", "22334488");
        phonebook.add("Иванов", "22334422");
        System.out.println("-----------------");

        System.out.println("Получаем номера");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));
        System.out.println("Сидоров");
        System.out.println(phonebook.get("Сидоров"));
        System.out.println("-----------------");

        System.out.println("Случай отсутствия записи");
        System.out.println("Кузнецов");
        System.out.println(phonebook.get("Кузнецов"));
        System.out.println("-----------------");

        System.out.println("Пробуем записать существующий номер");
        phonebook.add("Иванов", "223344");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
    }
}
