import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class BinarySearch {
    public static void main(String[] args) {
        Employee emp1 = new Employee(3, "Ali", 30800);
        Employee emp2 = new Employee(6, "Elena", 1800);
        Employee emp3 = new Employee(46, "Sabina", 3400);
        Employee emp4 = new Employee(1, "Ivan", 10400);
        Employee emp5 = new Employee(75, "Zaur", 20300);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);
        int index = Collections.binarySearch(employeeList, new Employee(75, "Zaur", 20300));
        System.out.println(index);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0) {
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
    
}
