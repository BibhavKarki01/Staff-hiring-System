
/**
 * Write a description of class PartTimeStaffHire here.
 *
 * @author  Bibhav karki
 * @London Met Id  (19031619)  30 December, 2019
 */
public class PartTimeStaffHire extends StaffHire
{
    //the child class PartTimeStaffHire is inherits from the parent class StaffHire
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated; 
    //access modifier private variable can be only used in this class.
    
    public PartTimeStaffHire (int vacancyNumber, String designation, String jobType, int workingHour, int wagesPerHour, String shifts)
     /* constructor used for staffHire is used to
     * initialize the object in this class*/
    {
        super(vacancyNumber,designation,jobType);
        //super keyword is used to call or calling the constructor of parent class StaffHire
        this.workingHour = workingHour;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        staffName="";// creating the null value 
        joiningDate="";
        qualification="";
        appointedBy="";
        boolean joined = false;
        boolean terminated = false;
    }
    
       public int getWorkingHour(){
           return workingHour;
        }
        //  A getter method is used for return the integer value of workingHour
     
       public void setWorkingHour(int workingHour)
       {
          this.workingHour = workingHour;
        }
         // A setter method is used to set or update the value of workingHour or local variable to instance variable.
    
       public int getWagesPerHour() {
            return wagesPerHour;
        }
       public void setWagesPerHour(int wagesPerHour) {
            this.wagesPerHour = wagesPerHour;
        }
     
       public String getStaffName(){
              return staffName;
           }
       public void setStaffName(String staffName) {
             this.staffName = staffName;
        }
                          
       public String getJoiningDate() {
             return joiningDate;
       }
       public void setJoiningDate(String joiningDate) {
                 this.joiningDate = joiningDate;
          } 
            
       public String getQualification() {
              return  qualification;
        }
       public void setQualification(String qualification){
             this.qualification = qualification;
         }
            
       public String getAppointedBy() {
             return appointedBy;
        } 
       public void setAppointedBy(String appointedby) {
            this.appointedBy = appointedBy;
        }
             
        public String getShifts() {
              return shifts;
            }
       public void setShifts(String newshifts) {
                   this.shifts = newshifts;
           }
              
       public boolean getJoined() {
             return joined;
         }
       public void setJoined(boolean joined) {
              this.joined = joined;
        } 
               
       public void setTerminated(boolean terminated)
        {
          this.terminated = terminated;
          }
       public boolean getTerminated()
        {
             return terminated;
         }
              
       public void partTimeStaff(String staffName,String joiningDate,String qualification,String appointedBy){
            if(joined==true){
              System.out.println("Staff Name :" +getStaffName()+"joined on:"+getJoiningDate());
            }
          else
           {
             this.staffName = staffName;
             this.joiningDate = joiningDate;
             this.qualification = qualification;
             this.appointedBy = appointedBy;
             this.joined=true;
             this.terminated=false;
            }
            /*method for hiring part time staff, it print the staffName, joiningDate if the joined is true otherwise set 
             * or update the value.
             */
         }
               
               public void terminated()
               {
                  if(terminated==true)
                {
                   System.out.println("The staff has been already terminated");
                }
               else
                {
                    staffName="";
                    joiningDate="";
                    qualification="";
                    appointedBy="";
                    joined=false;
                    terminated=true;
                }
                /* terminate method is used for termination of hiring
                 * if terminated is true print staff has already terminate
                 * otherwise return empty values
                 */
            }
             
             public void dispaly()
             {
               super.display();
                // This method is used to override the parent class to child class.
               if(joined == true)
               {
                  System.out.println("StaffName :" +getStaffName()+"\nWagesPerHour=" +getWagesPerHour()+"\nJoinedDate :" +getJoiningDate()+ "Qualification of Staffis:" +getQualification()+"\nAppointedBy:" +getAppointedBy()+"\nIncome Per Day:"+(wagesPerHour*workingHour));
               // print the variable if joined is true
                }
            }
        }