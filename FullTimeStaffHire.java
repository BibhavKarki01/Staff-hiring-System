
/**
 * Write a description of class FullTimeStaffHire here.
 *
 * @author Bibhav karki
 * @London Met Id  (19031619)  30 December, 2019
 */
   public class FullTimeStaffHire extends StaffHire
   //the child class FullTimeStaffHire is inherits from the parent class StaffHire
{
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    //access modifier private variable can be only used in this class.
    
     public FullTimeStaffHire (int vacancyNumber, String designation, String jobType, int salary, int workingHour)
     /* constructor used for staffHire is used to
     * initialize the object in this class*/
     {
        super(vacancyNumber,designation,jobType);
        //super keyword is used to call or calling the constructor of parent class StaffHire
        this.salary = salary;
        this.workingHour = workingHour;
        staffName = "";
        joiningDate = "";
        qualification = "";
        appointedBy = "";
        joined = false;
    }
    
     public int getSalary()
     {
        return salary;
    }
     //  A getter method is used for return the integer value of salary
     
     public int getWorkingHour()
     {
        return workingHour;
     }
     //  A getter method is used for return the integer value of workingHour.
     
    public String getStaffName()
    {
        return staffName;
    }
    //  A getter method is used for return the String value of staffName
     
     public void setStaffName(String staffName)
     {
        this.staffName = staffName;
    }
    // A setter method is used to set or update the value of staffName or local variable to instance variable.
    
    public String getJoiningDate()
    {
        return joiningDate;
    }
    //  A getter method is used for return the String value of joiningDate
     
     public void setJoiningDate(String joiningDate) 
     {
        this.joiningDate = joiningDate;
    }
    // A setter method is used to set or update the value of joiningDate or local variable to instance variable.
    
    public String getQualification()
    {
        return qualification;
    }
    public void setQualification(String qualification)
    {
        this.qualification = qualification;
    }
    // A setter method is used to set or update the value of staffName or local variable to instance variable.
    
    public String getAppointedBy()
    {
        return appointedBy;
    }
    //  A getter method is used for return the String value of appointedBy
    
     public void setAppointedBy(String appointedBy)
     {
        this.appointedBy = appointedBy;
    }
    // A setter method is used to set or update the value of appointedBy or local variable to instance variable.
    
    public boolean getJoined()
    {
        return joined;
    }
    //  A getter method is used for return the boolean value of joined which is either true or false.
    
     public void setJoined(boolean joined) 
     {
        this.joined = joined;
    }
      // A setter method is used to set or update the value of joined or local variable to instance variable.
      
    public void setSalary(int newsalary)
    {
        if( joined == false)
        {
            this.salary = newsalary;
        }
        else
        {  
            System.out.println("The staff is already appointed so there won't be any change in the salary. ");
        }    
    }
    /* A setter method is used to set or upadate the value of Salary to new salary 
     * if joined is equal to false then set or update the salary.
     */
    public void setWorkingHour(int newworkingHour)
    {
        this.workingHour = newworkingHour;
    }
    public void FullTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy)
    {
        if(joined == true)
        {
            System.out.println("The Staff Name: "+getStaffName()+ "\nJoined Date: "+getJoiningDate());
            
        }
        else
        {
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.joined = true;
        }
        /* A fullTimeStaff takes the parameter and print the staffName, joiningDate
         * if the staff has not joined otherwise set the value of parameter and 
         * joined is true
         */
    }
    public void display()
    {
        super.display();
        // This method is used to override the parent class to child class. 
        if(joined == true)
        {
            System.out.println("The Staff Name: "+getStaffName());
            System.out.println("Salary: "+getSalary());
            System.out.println("Working Hour: "+getWorkingHour());
            System.out.println("Joining Date: "+getJoiningDate());
            System.out.println("Qualification: "+getQualification());
            System.out.println("Appointed By: "+getAppointedBy());
            // print the variables if joined is equal true.
        }
    }
}