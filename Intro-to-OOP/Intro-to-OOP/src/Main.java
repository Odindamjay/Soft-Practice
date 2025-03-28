import Employee.Employee;
import EmployeeManager.Manager;
import Restaurant.MenuItem;
import Restaurant.OrderService;
import Restaurant.SimpleOrderService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        List<MenuItem> menuItems = new ArrayList<>(
                Arrays.asList(
                        new MenuItem("Pizza", 1000.0),
                        new MenuItem("Burger", 1500.0),
                        new MenuItem("French Fries", 2000.0),
                        new MenuItem("Hot Dog", 2500.0),
                        new MenuItem("Pasta", 3000.0),
                        new MenuItem("Chicken", 3500.0),
                        new MenuItem("Fried Rice", 4000.0),
                        new MenuItem("Pizza", 5000.0),
                        new MenuItem("Burger", 5500.0),
                        new MenuItem("French Fries", 6000.0),
                        new MenuItem("Hot Dog", 6500.0),
                        new MenuItem("Pasta", 7000.0),
                        new MenuItem("Chicken", 7500.0),
                        new MenuItem("Fried Rice", 8000.0),
                        new MenuItem("Pizza", 9000.0),
                        new MenuItem("Burger", 9500.0),
                        new MenuItem("French Fries", 10000.0),
                        new MenuItem("Hot Dog", 10500.0),
                        new MenuItem("Pasta", 11000.0),
                        new MenuItem("Chicken", 11500.0),
                        new MenuItem("Fried Rice", 12000.0)
                )
        );

        menuItems.forEach(System.out::println);

        SimpleOrderService orderService = new SimpleOrderService();

        orderService.placedOrder(menuItems.get(0));
        orderService.placedOrder(menuItems.get(1));
        orderService.placedOrder(menuItems.get(3));
        orderService.placedOrder(menuItems.get(4));
        orderService.placedOrder(menuItems.get(6));
        orderService.placedOrder(menuItems.get(7));
        orderService.placedOrder(menuItems.get(9));
        orderService.placedOrder(menuItems.get(4));
        orderService.placedOrder(menuItems.get(7));
        orderService.placedOrder(menuItems.get(1));
        orderService.placedOrder(menuItems.get(5));























//        List<Manager> managers = new ArrayList<Manager>(
//                Arrays.asList(
//                        // Create objects of managers with their properties
//                        new Manager("John", "Smith", "jdoe", 1000.0, "IT", 500.0),
//                        new Manager("Jane", "Williams", "jane", 2000.0, "HR", 600.0),
//                        new Manager("Joe", "Johnson", "joe", 3000.0, "IT", 700.0),
//                        new Manager("Jill", "Anderson", "jill", 4000.0, "HR", 800.0),
//                        new Manager("Jim", "Brown", "jim", 5000.0, "IT", 900.0),
//                        new Manager("Jenny", "Taylor", "jenny", 6000.0, "HR", 1000.0),
//                        new Manager("Jen", "Clark", "jen", 7000.0, "IT", 1100.0),
//                        new Manager("Jenny", "Thomas", "jenny", 8000.0, "HR", 1200.0),
//                        new Manager("Jen", "Wilson", "jen", 9000.0, "IT", 1300.0)
//                )
//        );
//
//        for (Manager manager : managers) {
//            System.out.println(manager.toString());
//
//
//
//            managers.forEach(m -> System.out.println(m.toString()));
//
//            managers.forEach(m -> System.out.println(m.getBonus()));
//
//            managers.forEach(m -> System.out.println(m.getDepartment()));
//
//            managers.forEach(m -> System.out.println(m.getFirstName()));
//
//            managers.forEach(m -> System.out.println(m.getLastName()));
//
//            managers.forEach(m -> System.out.println(m.getEmail()));
//
//            managers.forEach(m -> System.out.println(m.getSalary()));
//
//            managers.stream().filter(m -> m.getSalary() > 10000.0).forEach(m -> System.out.println(m.toString()));
//
//
//            managers.stream().filter(m -> m.getSalary() > 10000.0).forEach(m -> System.out.println(m.getBonus()));
//
//            managers.stream().filter(m -> m.getSalary() > 10000.0).forEach(m -> System.out.println(m.getDepartment()));
//
//            managers.stream().filter(m -> m.getSalary() > 10000.0).forEach(m -> System.out.println(m.getFirstName()));
//
//            managers.stream().filter(m -> m.getSalary() > 10000.0).forEach(m -> System.out.println(m.getLastName()));
//
//            managers.stream().filter(m -> m.getSalary() > 10000.0).forEach(m -> System.out.println(m.getEmail()));





















//        List<Employee> employees = List.of(
//                new Employee("John", "Smith", "jdoe", 1000.0),
//                new Employee("Jane", "Williams", "jane", 2000.0),
//                new Employee("Joe", "Johnson", "joe", 3000.0),
//                new Employee("Jill", "Anderson", "jill", 4000.0),
//                new Employee("Jim", "Brown", "jim", 5000.0),
//                new Employee("Jenny", "Taylor", "jenny", 6000.0),
//                new Employee("Jen", "Clark", "jen", 7000.0),
//                new Employee("Jenny", "Thomas", "jenny", 8000.0),
//                new Employee("Jen", "Wilson", "jen", 9000.0)
//        );
//
//        for (Employee employeeu : employees) {
//            System.out.println(employeeu);


//        LeapYearChecker lyp = new LeapYearChecker();
//        System.out.println(lyp.isLeapYear(0));

//        CarRental rentalSystem = new CarRental(); // Create an object
//        rentalSystem.rentCar();

//        System.out.println("Hello, World!");
        }
    }
