public class TestEmployeeSystem {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        // Add employees
        manager.addEmployee(new Employee(101, "Aarav", "Manager", 50000));
        manager.addEmployee(new Employee(102, "Meena", "Developer", 35000));
        manager.addEmployee(new Employee(103, "Raj", "Designer", 30000));

        // Display all
        System.out.println("All Employees:");
        manager.displayAllEmployees();

        // Search
        System.out.println("\nSearch for employee with ID 102:");
        Employee emp = manager.searchEmployee(102);
        System.out.println(emp != null ? emp : "Not found");

        // Delete
        System.out.println("\nDeleting employee with ID 102...");
        manager.deleteEmployee(102);

        // Display again
        System.out.println("\nUpdated Employee List:");
        manager.displayAllEmployees();
    }
}
