import java.util.*;
import java.util.function.*;

public class StudentManagement implements Management {


    @Override
    public void displayStudents(List<Student> students, Consumer<Student> con) {
        students.forEach(con);
    }


    @Override
    public void displayStudentsByFilter(List<Student> students, Predicate<Student> pre, Consumer<Student> con) {
        students.stream()
                .filter(pre)
                .forEach(con);
    }


    @Override
    public String returnStudentsNames(List<Student> students, Function<Student, String> fun) {
        return students.stream()
                .map(fun)
                .reduce((name1, name2) -> name1 + ", " + name2)
                .orElse("");
    }


    @Override
    public Student createStudent(Supplier<Student> sup) {
        return sup.get();
    }


    @Override
    public List<Student> sortStudentsById(List<Student> students, Comparator<Student> com) {
        students.sort(com);
        return students;
    }
}
