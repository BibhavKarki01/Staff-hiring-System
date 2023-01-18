
/**
 * Write a description of class StaffHire here.
 *
 * @author Bibhav karki
 * @London Met Id  (19031619)  30 December, 2019
 */
public class StaffHire
{
    private int vacancyNumber;
    private String designation;
    private String jobType;
    //access modifier private variable can be only used in this class.
    
    public StaffHire(int vacancyNumber, String designation, String jobType)
    /* constructor used for staffHire is used to
     * initialize the object in this class*/
     {
        this.vacancyNumber=vacancyNumber;
        this.designation=designation;
        this.jobType=jobType;
    }
    // introduce and set the value of object in constructor
    
    public int getVacancyNumber(){
        return vacancyNumber;
    } 
    // getter method is used for return the integer value of vacancyNumber
    
      public void setVacancyNumber(int vacancynumber){
        this.vacancyNumber = vacancyNumber;
    }
    // setter method is uesd for set or update the value of vacancyNumber
    
    public String getDesignation(){
        return designation;
    }
    // getter method is used for return the String value of designation

    public void setDesignation(String designation){
        this.designation = designation;
    }
    // setter method is uesd for set or update the value of designation
    
    public String getJobType(){
        return jobType;
    } 
     // getter method is used for return the String value of jobType
     
    public void setJobType(String jobType){
        this.jobType = jobType;
    }
     // setter method is uesd for set or update the value of jobType
     
    public void display()
    // display method is uesd for dispaly the values of variable
    {
        System.out.println("VacancyNumber ="+ getVacancyNumber());
        System.out.println("Designation ="+ getDesignation());
        System.out.println("JobType ="+ getJobType());
    }
    }