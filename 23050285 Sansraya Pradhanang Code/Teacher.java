public class Teacher 
{
  private int teacherID,workingHours; //These are the attributes
  private String teacherName,teacherAddress,workingType,employmentStatus;
  // Writing a constructor
    public Teacher(int teacherID, String teacherName,String teacherAddress, String workingType, String employmentStatus) 
    {
      this.teacherID=teacherID;
      this.teacherName=teacherName;
      this.teacherAddress=teacherAddress;
      this.workingType=workingType;
      this.employmentStatus=employmentStatus;
    }
    // Accessor methods(getters)
    public String getTeacherName()
    {
    return this.teacherName;
    }
    public String getTeacherAddress()
    {
        return this.teacherAddress;
    }
    public String getWorkingType()
    {
        return this.workingType;
    }
    public String getEmploymentStatus()
    {
        return this.employmentStatus;
    }
    public int getTeacherID()
    {
        return this.teacherID;
    }
    public int getWorkingHours()
    {
        return this.workingHours;
    }
    //Setter
    public void setHour(int workingHours)
    {
        this.workingHours=workingHours;
    }
    // Method to show the number of working hours
    public void display()
    {
        System.out.println("The teacher's name: "+getTeacherName()+",id: "+getTeacherID()+",address:"+getTeacherAddress()+",type of work: "+getWorkingType()+", and the emploment status: "+getEmploymentStatus());
        if(workingHours!=0)
        {
            System.out.println("Finally the teacher's working hours: "+getWorkingHours());
        }
        else
        {
            System.out.println("Please fill up the working hours of teacher. Thank you!");
        }
    }
    
}