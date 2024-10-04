import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentInfo {

    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
//    void printStudentsOverGrade(ArrayList<Student> al, double grade) {
//        for (Student s : al) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(ArrayList<Student> al, int age) {
//        for (Student s : al) {
//            if (s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
//        for (Student s : al) {
//            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ali", 'm', 29, 4, 9.5);
        Student st2 = new Student("Anna", 'f', 22, 3, 8.3);
        Student st3 = new Student("Zaur", 'm', 20, 1, 7.5);
        Student st4 = new Student("Sabina", 'f', 21, 2, 9.2);
        Student st5 = new Student("Sabir", 'm', 25, 4, 6.9);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        StudentInfo info = new StudentInfo();
//        info.testStudents(students, new CheckOverGrade());
//        System.out.println("-------------------------------");
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age < 30;
//            }
//        });
        System.out.println("-------------------------------");
        info.testStudents(students, (Student s) -> {
            return s.age < 30;
        });
//        info.printStudentsOverGrade(students,9.4);
//        System.out.println("-------------------------------");
//        info.printStudentsUnderAge(students,21);
//        System.out.println("-------------------------------");
//        info.printStudentsMixCondition(students,28,9.9,'m');
    }
}

interface StudentChecks {
    boolean check(Student s);
}

class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}