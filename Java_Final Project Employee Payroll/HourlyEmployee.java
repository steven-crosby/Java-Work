public class HourlyEmployee {

    //private variable with a decimal point for the number of hours the employee has worked
    private double hoursWorked;

    //private variable with a decimal point for the wage the employee earns per hour
    private double hourlyPay;

    //private variable with a decimal point for when the employee works more then 40 hours a week
    private double overtimeHours;

    // no-arg constructor which creates a default HourlyEmployee
    /**
     * no-argument constructor which creates an HourlyEmployee object
     */
    public HourlyEmployee() {
        hoursWorked = 0;
        hourlyPay = 0;
        overtimeHours = 0;
    }

    //Uses the variables passed into the method when called, and places the new values into the same variables.
    /**
     * Uses the variables passed into the method when called, and places the new values into the same variables.
     * @param hoursWorked user value for the hours worked
     * @param hourlyPay user value for the hourly pay
     */
    public HourlyEmployee(double hoursWorked, double hourlyPay) {

        //Used this.variable, with this meaning this object since we're using the same variable name as what was passed into the method.
        this.hoursWorked = hoursWorked;
        this.hourlyPay = hourlyPay;

    }

    //gets the private variable hoursWorked and returns it to be used.
    /**
     * returns the variable hoursWorked from the object
     * @return hoursWorked
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    //gets the private variable hourlyWage and returns it to be used.
    /**
     * returns the variable hourlyPay from the object
     * @return hourlyPay
     */
    public double getHourlyPay() {
        return hourlyPay;
    }

    //gets the private variable overtimeHours and return it to be used.
    /**
     * returns the variable overtimeHours from the object
     * @return overtimeHours
     */
    public double getOvertimeHours() {
        return overtimeHours;
    }

    //takes the value passed into the method in variable hoursWorked, and sets the private variable hoursWorked to the new value.
    /**
     * sets the variable hoursWorked to the double parameter
     * @param hoursWorked hours the employee has worked
     */
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //takes the value passed into the method in variable hoursWorked, and sets the private variable hourlyWage to the new value.
    /**
     * sets the variable hourlyPay to the double parameter
     * @param hourlyPay how much per hour the employee is paid
     */
    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    //takes the value passed into the method in variable overtimeHours, and sets the private variable overtimeHours to the new value.
    /**
     * sets the varaible overtimeHours to the double parameter
     * @param overtimeHours hours the employ has worked overtime
     */
    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    //Method to calculate the employees paycheck based on hours worked, their wage, and if they worked overtime hours.
    /**
     * calculates and displays the how much the HourlyEmployee will be paid this week
     */
    public void employeePaystub() {

        //Determines if the employee worked more then 40 hours, if so times the employees wage by 1.5 for the overtime hours worked and returns the value.
        if (hoursWorked > 40) {
            double overtimeHours = (40 * hourlyPay) + ((hoursWorked - 40) * hourlyPay * 1.5);

            //Display's to the user the total pay with overtime, rounded to two decimal points.
            System.out.println("This weeks check: $" + Math.round(overtimeHours * 100.00) / 100.00);
        }

        //If the employee didn't work over 40 hours, return the value of the hours worked * their wage.
        else {
            double overtimeHours = hoursWorked * hourlyPay;

            //Display's to the user the total pay with no overtime, rounded to two decimal points.
            System.out.println("This weeks check: $ " + Math.round(overtimeHours * 100.00) / 100.00);
        }
    }
}
