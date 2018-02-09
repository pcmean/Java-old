public class Student
{

    public String firstName;
    public String lastName;
    public String name = new String(firstName +" "+ lastName);
    private int gradYear;
    private double[] classGrades;

    public Student()
    {
        firstName = new String (" ");
        lastName =new String("");
        gradYear=0;
        classGrades=new double[5];
        for(int i = 0;i<classGrades.length;i++){
            classGrades[i] = 0;
        }

    }//end zero constructor student
    public Student(String firstName, String lastName, int gradYear, double gradeEnglish, double gradeMath, double gradeScience, double gradeFineArts,double gradeSocialScience)
    {
        this.firstName=firstName;
        this.lastName = lastName;
        this.gradYear=gradYear;
        this.classGrades=new double[5];
        this.classGrades[0]=gradeEnglish;
        this.classGrades[1]=gradeMath;
        this.classGrades[2]=gradeScience;
        this.classGrades[3]=gradeFineArts;
        this.classGrades[4]=gradeSocialScience;

        
    }//end constructor student
    public void setGPA(double english, double math, double science, double art, double socialScience){
        this.classGrades[0]=english;
        this.classGrades[1]=math;
        this.classGrades[2]=science;
        this.classGrades[3]=art;
        this.classGrades[4]=socialScience;

    }
    public double calcGPA()
    {
        double total=0.0;
        for(int i=0; i<classGrades.length;i++)
        {
            total+=classGrades[i];

        }//end for 

        total=total/classGrades.length;
        return total;

    }//end calcGPA
    

    public char getGrade(){
        switch((int)calcGPA()){
            case 1:
            return 'D';
            case 2:
            return 'C';
            case 3:
            return 'B';
            case 4:
            return 'A';
            default:
            return 'F';

        }
    }

    public String toString()
    {

        return "Name : " + firstName +" "+lastName + "\nGPA: " +calcGPA() + " Grade: " + getGrade() +"\n" +classGrades[0] + " "+ classGrades[1] +" "+ classGrades[2] +" "+ classGrades[3]+" "+ classGrades[4];     
        
    }//end toString
}//end class Student