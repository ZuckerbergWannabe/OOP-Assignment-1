import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        School school = new School();

        // Create sample students
        Student student1 = new Student("John", "Doe", 20, true);
        student1.addGrade(90);
        student1.addGrade(85);
        Student student2 = new Student("Jane", "Smith", 22, false);
        student2.addGrade(95);
        student2.addGrade(88);

        // Create sample teachers
        Teacher teacher1 = new Teacher("Alice", "Johnson", 45, false, "Math", 15, 60000);
        Teacher teacher2 = new Teacher("Bob", "Brown", 35, true, "Science", 8, 50000);

        // Add members to the school
        school.addMember(student1);
        school.addMember(student2);
        school.addMember(teacher1);
        school.addMember(teacher2);

        // Demonstrate specific methods
        System.out.println(student1.toString() + " GPA: " + student1.calculateGPA());
        teacher1.giveRaise(10);
        System.out.println(teacher1.toString() + " New salary: " + teacher1.salary);

        // Print all members
        System.out.println("\nSchool Members:");
        System.out.println(school.toString());
    }
}