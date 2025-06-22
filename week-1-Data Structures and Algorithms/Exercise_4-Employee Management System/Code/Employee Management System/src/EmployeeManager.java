public class EmployeeManager {
    private Employee[] employees;
    private int size;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Add employee
    public void addEmployee(Employee emp) {
        if (size < employees.length) {
            employees[size++] = emp;
        } else {
            System.out.println("Array full. Cannot add more employees.");
        }
    }

    // Search by ID
    public Employee searchEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse (display all)
    public void displayAllEmployees() {
        if (size == 0) {
            System.out.println("No employees to display.");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(employees[i]);
            }
        }
    }

    // Delete employee by ID
    public void deleteEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];  // shift left
                }
                employees[size - 1] = null;
                size--;
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
