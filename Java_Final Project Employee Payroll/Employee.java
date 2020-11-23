/* UML
Name: Employee
Data Fields:
- firstName :string
- lastName :string
- SSN :string
Constructors and Methods:
+ Employee()
+ Employee(newFirst :string, newLast :string, newID :int, newDOB :string, newSSN :string)
+ getFirstName() :string
+ setFirstName(newFirst :string) :void
+ getLastName() :string
+ setLastName(newLast :string) :void
+ getIDNumber() :int
+ setIDNumber (newID :int) :void
+ getDOB() :string
+ setDOB(newDOB :string) :void
+ getSSN() :string
+ setSSN(newSSN :string) :void
 */
// Employee Class

public class Employee {

    //private variable for the users first name.
    public String firstName;

    //private variable for the users last name.
    public String lastName;

    //private variable with no decimal points for the users ID number.
    public int idNumber;

    // private variable for wage type
    public int wageType;

    // no-arg constructor which creates a default Employee
    /**
     * no-arg constructor creates an Employee object
     */
    public Employee() {
        firstName = "None";
        lastName = "None";
        wageType = 0;
        idNumber = 0;
    }

    //Uses the variables passed into the method when called, and places the new values into the same variables.
    /**
     * creates an Employee object using the parameters, all employees must have these variables
     * @param firstName first name of the employee
     * @param lastName surname of the employee
     * @param wageType type of wage is hourly, commission, or salary
     * @param idNumber identification number of the employee
     * (removed dob and ssn parameters, due to their lack of use)
     */
    public Employee(String firstName, String lastName, int idNumber, int wageType) {

        //Used this.variable, with this meaning this object since we're using the same variable name as what was passed into the method.
        this.firstName = firstName;
        this.lastName = lastName;
        this.wageType = wageType;
        this.idNumber = idNumber;
    }

    public Employee(double salaryAmount) {
    }

    public Employee(double sales, double percent) {
    }

    //gets the private variable firstName and returns it to be used.
    /**
     * returns the first name of the employee
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    //takes the value passed into the method in variable firstName, and sets the private variable firstName to the new value.
    /**
     * sets the first name of the employee to the string
     * @param firstName first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //gets the private variable lastName and returns it to be used.
    /**
     * returns the last name of the employee
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    //takes the value passed into the method in variable lastName, and sets the private variable lastName to the new value.
    /**
     * sets the last name of the employee to the string
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWageType() {
        return wageType;
    }

    public void setWageType(int wageType) {
        this.wageType = wageType;
    }

    //gets the private variable idNumber and returns it to be used.
    /**
     * returns the ID number of the employee
     * @return idNumber
     */
    public int getIdNumber() {
        return idNumber;
    }

    //takes the value passed into the method in variable idNumber, and sets the private variable idNumber to the new value.
    /**
     * sets the employee ID number to the int parameter
     * @param idNumber employee ID
     */
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    //Method to display the users check with the users name, id number, date of birth, and social security number.
    /**
     * displays employee identification for the user to see
     */
    public void employeePaycheck() {
        System.out.println("\nEmployee: " + firstName + " " + lastName + "\nWage Type: " + wageType + "\nId Number: " + idNumber);

    }
}
