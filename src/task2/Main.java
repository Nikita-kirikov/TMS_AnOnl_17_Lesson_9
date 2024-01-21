package task2;


/*
1. Создать класс, в котором будет статический метод.
(почитать и понять, чем статический метод отличается от нестатического
- обсудить на занятии по необходимости)
Этот метод принимает на вход три параметра:
Login,
Password,
confirmPassword.
Все поля имеют тип данных String.
Длина login должна быть меньше 20 символов и не должен содержать
пробелы.
Если login не соответствует этим требованиям, необходимо выбросить
WrongLoginException.
Длина password должна быть меньше 20 символов, не должен
содержать пробелом и должен содержать хотя бы одну цифру.
Также password и confirmPassword должны быть равны.
Если password не соответствует этим требованиям, необходимо
выбросить WrongPasswordException.
WrongPasswordException и WrongLoginException - пользовательские
классы исключения с двумя конструкторами – один по умолчанию,
второй принимает сообщение исключения и передает его в конструктор
класса Exception.
Метод возвращает true, если значения верны или false в другом случае
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(ConfirmUser.confirm("login", "sas1s1d", "sas1s1d"));
        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.println("Ошибка " + e.getMessage());
        }
    }
}