package org.persona;
import java.time.LocalDate;

public class Persona implements Dates {

    private String name;
    private Date birthday;
    private int age;

    public Persona(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
        this.age = getAge();
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getAge() {

        LocalDate actualDate = LocalDate.now();
        int actDay = actualDate.getDayOfMonth();
        int actMonth = actualDate.getMonthValue();
        int actYear = actualDate.getYear();

        int realAge = actYear - birthday.getYear();

        if (birthday.getMonth() > actMonth) {
            realAge -= 1;
        } else if (birthday.getMonth() == actMonth) {
            if (birthday.getDay() > actDay) {
                realAge -= 1;
            }
        }
        return realAge;
    }

    @Override
    public void printDate() {
        birthday.printDate();
    }
}
