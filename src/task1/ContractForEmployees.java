package task1;

import java.util.Date;

public class ContractForEmployees implements Document {
    private Date date;
    private String num;
    private Date dateOfEnd;
    private String name;

    public ContractForEmployees() {
    }

    public ContractForEmployees(String num, String name, Date d) {
        this.date = new Date();
        this.num = num;
        this.dateOfEnd = d;
        this.name = name;

    }

    @Override
    public String toString() {
        return "ContractForEmployees{" +
                "date=" + date +
                ", num=" + num +
                ", dateOfEnd=" + dateOfEnd +
                ", name='" + name + '\'' +
                '}';
    }

    public String getNum() {
        return num;
    }
}
