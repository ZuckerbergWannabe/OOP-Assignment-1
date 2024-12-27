import java.util.ArrayList;
import java.util.Comparator;

class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    double salary;

    public Teacher(String name, String surname, int age, boolean isMale, String subject, int yearsOfExperience, double salary) {
        super(name, surname, age, isMale);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public void giveRaise(double percentage) {
        this.salary += this.salary * (percentage / 100);
    }

    @Override
    public String toString() {
        return super.toString() + " I teach " + subject + ".";
    }
}