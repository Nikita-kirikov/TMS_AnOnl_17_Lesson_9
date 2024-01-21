package task2;

public class ConfirmUser {

    public static boolean confirm(String login, String password, String conPassword) throws WrongLoginException, WrongPasswordException {
        boolean isValidLogin = false;
        boolean isValidPass = false;


        if (!login.isEmpty() && login.length() < 20 && !login.matches(".*\\s.*")) {
                isValidLogin = true;
        } else {
            throw new WrongLoginException("Логин не соответствует требованиям");
        }


        if (!password.isEmpty() && password.length() < 20 &&
                password.equals(conPassword) && !password.matches(".*\\s.*") &&
                password.matches(".*\\d.*")) {
            isValidPass = true;
        } else {
            throw new WrongPasswordException("Пароль не соответствует требованиям");
        }
        return isValidLogin && isValidPass;
    }
}
