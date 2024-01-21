package task1;

public class CheckDocs {
    public boolean checkABC(String doc) throws ContainsException{
        boolean isValid = false;

        if (doc.contains("abc")) {
            isValid = true;
        } else {
            throw new ContainsException("Данная строчка не содержит ABC");
        }

        return isValid;
    }

    public boolean check555(String doc) throws StartException {
        boolean isValid = false;

        if (doc.startsWith("555")) {
            isValid = true;
        } else {
            throw new StartException("Данный документ не начинается с 555");
        }

        return isValid;
    }

    public boolean check1A2B(String doc) throws EndException {
        boolean isValid = false;

        if (doc.endsWith("1a2b")) {
            isValid = true;
        } else {
            throw new EndException("Данный документ не заканчивается на 1a2b");
        }

        return isValid;
    }
}
