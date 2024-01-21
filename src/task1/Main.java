package task1;
/* 1. Работа с прошлыми домашними заданиями.
Создать свои классы исключений на каждую ситуацию:
- Проверить содержит ли номер документа последовательность abc.
- Проверить начинается ли номер документа с последовательности 555.
- Проверить заканчивается ли номер документа на последовательность 1a2b.
Если номер документа не удовлетворяет условию - то "бросить" исключение.
В методе класса, в котором будут вызываться эти методы для демонстрации работы,
перехватить исключение конструкцией try-catch и в блоке catch вывести сообщение
для пользователя (сообщение на консоль). */

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ContractForEmployees emp1 = new ContractForEmployees("555avbrfwefe", "Vlad", new Date());
        ContractForEmployees emp2 = new ContractForEmployees("asdawdaabcsd32342", "Illy", new Date());
        ContractForEmployees emp3 = new ContractForEmployees("fjgjbvhfhef1a2b", "Vova", new Date());

        CheckDocs check1 = new CheckDocs();

        try {
            System.out.println(check1.check555(emp1.getNum()));
            System.out.println(check1.checkABC(emp2.getNum()));
            System.out.println(check1.check1A2B(emp3.getNum()));
        } catch (StartException | ContainsException | EndException e) {
            System.out.println(e.getMessage());
        }
    }
}