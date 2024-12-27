import java.util.ArrayList;
import java.util.Comparator;

class Student extends Person {
    private static int idCounter = 1;
    private int studentID;
    private ArrayList<Integer> grades;

    public Student(String name, String surname, int age, boolean isMale) {
        super(name, surname, age, isMale);
        this.studentID = idCounter++;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
    }

    public double calculateGPA() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + ".";
    }
}
