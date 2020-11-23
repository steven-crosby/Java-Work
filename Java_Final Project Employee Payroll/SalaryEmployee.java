public class SalaryEmployee {

    // Private variable name salary
    private double salary;

    // non-arg constructor that creates a default SalaryEmployee
    public SalaryEmployee() {

    }

    // Constructor that uses the variable passed into the method when call, and
    // places its new value into it
    public SalaryEmployee(double salary) {
        this.salary = salary;
    }

    // Gets the salary of employee and returns its value
    public double getSalary() {
        return salary;
    }

    // Takes the value passed and sets it the new value
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Calculates the total of salary and prints it out
    public void employeePaystub() {
        double total = salary / 52;
        System.out.println("Weekly Salary Pay: $" + Math.round(total * 100.00) / 100.00);
    }
}
