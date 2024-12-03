import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();


        List<Student> students = Arrays.asList(
                new Student(3, "Adem", 21),
                new Student(1, "Aban wiwi fi denya ", 22),
                new Student(2, "Mustpha", 23)
        );


        System.out.println("Tous les étudiants :");
        sm.displayStudents(students, System.out::println);


        System.out.println("\nÉtudiants avec un âge > 21 :");
        sm.displayStudentsByFilter(students, s -> s.getAge() > 21, System.out::println);


        System.out.println("\nNoms des étudiants :");
        String names = sm.returnStudentsNames(students, Student::getName);
        System.out.println(names);


        Student newStudent = sm.createStudent(() -> new Student(4, "wael", 25));
        System.out.println("\nNouvel étudiant créé : " + newStudent);


        System.out.println("\nÉtudiants triés par ID :");
        List<Student> sortedStudents = sm.sortStudentsById(students, Comparator.comparingInt(Student::getId));
        sortedStudents.forEach(System.out::println);
    }
}
