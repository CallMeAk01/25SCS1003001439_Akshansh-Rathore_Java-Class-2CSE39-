class Employee {
    protected String employeeId;
    protected String employeeName;

    public Employee(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public double calculateSalary() {
        return 0.0;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + employeeName);
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String employeeId, String employeeName, double monthlySalary) {
        super(employeeId, employeeName);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double hoursWorked;
    private double paymentPerHour;

    public PartTimeEmployee(String employeeId, String employeeName, double hoursWorked, double paymentPerHour) {
        super(employeeId, employeeName);
        this.hoursWorked = hoursWorked;
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * paymentPerHour;
    }
}

public class EmployeeSalarySystem {
    public static void main(String[] args) {
        // Demonstrating Runtime Polymorphism using Parent class reference
        Employee emp1 = new FullTimeEmployee("EMP101", "Akshansh Rathore", 75000.0);
        Employee emp2 = new PartTimeEmployee("EMP102", "Rahul Sharma", 40, 500.0);

        System.out.println("=== Full-Time Employee Details ===");
        emp1.displayDetails();
        System.out.println("Calculated Salary: ₹" + emp1.calculateSalary());

        System.out.println("\n=== Part-Time Employee Details ===");
        emp2.displayDetails();
        System.out.println("Calculated Salary: ₹" + emp2.calculateSalary());
    }
}