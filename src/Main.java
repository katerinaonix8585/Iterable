import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        CustomList array = new CustomList(new int[]{12, 4, 32, 4});

        for (Object elem: array) {
            System.out.println(elem);
        }

        System.out.println("---------------------------------------------");
        array.add(45);

        for (Object elem: array) {
            System.out.println(elem);
        }
        System.out.println("---------------------------------------------");

        array.remove(4);
        for (Object elem: array) {
            System.out.println(elem);
        }
        System.out.println("---------------------------------------------");

        array.add(4);

        for (Object elem: array) {
            System.out.println(elem);
        }
        System.out.println("---------------------------------------------");

        array.removeAll(4);
        for (Object elem: array) {
            System.out.println(elem);
        }
        System.out.println("---------------------------------------------");

        System.out.println(array.IndexOf(32));
        System.out.println(array.IndexOf(48));
    }

    public static void hw(){
        Employee[] employees = new Employee[6];
        employees[0] = new Programmer("Анатолий", "Ушанов", 1200);
        employees[1] = new Programmer("Максим", "Грибов", 1200);
        employees[2] = new Programmer("Роман", "Иванов", 1600);
        employees[3] = new Manager("Анатолий", 31, 1700);
        employees[4] = new Manager("Алексей", 35, 1900);
        employees[5] = new Manager("Василий", 27, 2200);

        Employee result = employees[0];

        for (Employee employee: employees) {
            if (result.getSalary() < employee.getSalary()){
                result = employee;
            }
        }
        System.out.println(result.info());
    }

    public static void al(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(22);
        numbers.add(32);
//        for (int elem: numbers) {
//            System.out.println(elem);
//        }

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()){
            int value = iterator.next();
            System.out.println(value);
        }
    }
}