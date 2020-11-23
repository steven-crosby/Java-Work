public class CommissionEmployee {
    // variables unique to commissioned
    private double sales;
    private double percent;
    private double commission;

    // no-argument constructor for commission
    /**
     * creates a no-argument constructor for CommissionedEmployee
     *
     * @return
     */
    public void CommissionedEmployee() {
        sales = 0;
        percent = 0;
        commission = 0;
    }

    // parameterized constructor for commissioned
    /**
     * creates a CommissionedEmployee object using the parameters
     * @param newSales user value for the sales variable
     * @param newPercent user value for the percent variable
     */
    public CommissionEmployee(double newSales, double newPercent) {
        this.sales=newSales;
        this.percent=newPercent;
    }

    // gets and returns the requested value
    /**
     * returns the sales variable of the object
     *
     * @return sales
     */
    public double getSales() {
        return sales;
    }

    /**
     * returns the percent of the object
     *
     * @return percent
     */
    public double getPercent() {
        return percent;
    }

    // sets the variable to the value input
    /**
     * sets the variable sales to the parameter
     *
     * @param newSales sales of the object
     */
    public void setSales(double newSales) {
        this.sales = newSales;
    }

    /**
     * sets the variable percent to the parameter
     *
     * @param newPercent percent of the object
     */
    public void setPercent(double newPercent) {
        this.percent = newPercent;
    }

    // method to calculate and display the paystub
    /**
     * calculates and displays the payment and paystub
     */
    public void employeePaystub() {
        double commission = sales / percent;
        System.out.println("This weeks check: $ " + Math.round(commission * 100.00) / 100.00);
    }
}
