public class Lecturer extends Teacher
{ 
    //Attributes
    private String department;
    private int yearsOfexperience,gradedScore;
    private boolean hasGraded;
    //A constructor is defined to assign and accept values
    public Lecturer(int teacherID,String teacherName,String teacherAddress,String workingType,String employmentStatus,String department,int yearsOfexperience,int workingHours)
    {
    super(teacherID,teacherName,teacherAddress,workingType,employmentStatus);
    super.setHour(workingHours);
    gradedScore=0;
    this.department=department;
    this.yearsOfexperience=yearsOfexperience;
    hasGraded=false;
    }
    //Accessor methods for attributes(getters)
    public String getDepartment()
    {
        return this.department;
    }
    public int getYearsOfExperience()
    {
        return this.yearsOfexperience;
    }
    public int getGradedScore()
    {
        return this.gradedScore;
    }
    public boolean getHasGraded()
    {
        return this.hasGraded;
    }   
    // Mutator method for setting graded score 
    public void setGradedScore(int gradedScore)
    {
        this.gradedScore=gradedScore;
    }
    // A method to grade the assignment accepting suitable parameters
    public void gradeAssignment(int gradedScore,String department,int yearsOfexperience)
    {   
        this.gradedScore=gradedScore;
        if(yearsOfexperience>=5 && department.equals("Computing")){
            if(gradedScore>=70){
                System.out.println("The student got an A");
            }
             else if(gradedScore>=60 && gradedScore<70){
                System.out.println("The student got a B");
              }
              else if(gradedScore>=50 && gradedScore<60){
                System.out.println("The student got a C");
              }
              else if(gradedScore>=40 && gradedScore<50){
                System.out.println("The student got a D");
              }
              else{
                System.out.println("The student got an E");
              }
        hasGraded=true;    
         
        }
        else{
            System.out.println("The teacher is not eligible");
        }
        
    }
    // A method to display parent class information as well as lecturer using method overriding
    @Override
    public void display()
    {
        super.display();
        System.out.println("The department of the lecturer is: "+getDepartment()+",years of experience is:"+getYearsOfExperience()+",and the graded score is:"+getGradedScore());
        if(hasGraded==false)
        {
            System.out.println("Please grade the student's score");
        }
    }

}