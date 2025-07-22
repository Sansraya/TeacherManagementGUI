    public class Tutor extends Teacher
{
    //Attributes assigned
    private double salary;
    private String specialization;
    private String academicQualification;
    private int performanceIndex;
    private boolean isCertified;
    // A constructor that accepts several parameters and assign values
    public Tutor(int teacherID,String teacherName,String teacherAddress,String workingType,String employmentStatus,int workingHours,double salary,String specialization,String academicQualification,int performanceIndex)
    { 
        super(teacherID,teacherName,teacherAddress,workingType,employmentStatus);
        super.setHour(workingHours);
        this.salary=salary;
        this.specialization=specialization;
        this.academicQualification=academicQualification;
        this.performanceIndex=performanceIndex;
        isCertified=false;
    }
    // Accessor methods for each attributes
    public String getSpecialization()
    {
        return this.specialization;
    }
    public int getPerformanceIndex()
    {
        return this.performanceIndex;
    }
    public double getSalary()
    {
        return this.salary;
    }
    public boolean getIsCertified()
    {
        return this.isCertified;
    }
    public String getAcademicQualification()
    {
        return this.academicQualification;
    }
    //Mutator method for setting salary;
    public void setSalary(double salary,int performanceIndex)
    {
        int workingHours=getWorkingHours();
        this.performanceIndex=performanceIndex;
        if(performanceIndex>5 && workingHours>20){
           if(performanceIndex>=5 && performanceIndex<=7){
              this.salary=salary+(0.05*salary);
              System.out.println("New salary has been set");
           }
           else if(performanceIndex>=8 && performanceIndex<=9){
               this.salary=salary+(0.1*salary);
               System.out.println("New salary has been set");
           }
           else if(performanceIndex==10){
               this.salary=salary+(0.2*salary);
               System.out.println("New salary has been set");
           }
           else{
               System.out.println("Incorrect performance index was inputed or not enough working hours");
           }
           isCertified=true;
           
        }
        if(isCertified!=true){
            System.out.println("The tutor has not been certified yet. Hence,the salary of the tutor cannot be approved");
        }
        
    }
    // A method to remove tutor 
    public void removeTutor()
    {
        if(isCertified!=true){
            salary=0d;
            specialization="Nothing";
            academicQualification="Nothing";
            performanceIndex=0;
            isCertified=false;
        }
    }
    // A method to diplay appropriate information of tutor and parent class(teacher)
    public void display()
    {
        if(isCertified==false){
            super.display();
            }
        else{
            System.out.println("The tutor's salary is:"+getSalary()+",specilization:"+getSpecialization()+",academic qualification:"+getAcademicQualification()+",performance index:"+getPerformanceIndex());
            super.display();
        }
    }
}
