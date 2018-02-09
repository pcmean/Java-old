public class StudentUpgrade{

    private String name;
    private String firstName;
    private String lastName;
    private int gradYear;
    private double[] classGrades;

    public StudentUpgrade(){
        name=new String("");
        gradYear=0;
        classGrades=new double[5];
        this.classGrades[0]=0.0;
        this.classGrades[1]=0.0;
        this.classGrades[2]=0.0;
        this.classGrades[3]=0.0;
        this.classGrades[4]=0.0;

    }

    public StudentUpgrade(String name, int gradYear, double gradeEnglish, double gradeMath, double gradeScience, double gradeFineArts, double gradeSocialScience){

        this.name="Students name is: "+name;
        this.gradYear=gradYear;
        this.classGrades=new double[5];
        this.classGrades[0]=gradeEnglish;
        this.classGrades[1]=gradeMath;
        this.classGrades[2]=gradeScience;
        this.classGrades[3]=gradeFineArts;
        this.classGrades[4]=gradeSocialScience;

    }

    public StudentUpgrade(String firstName, String lastName, int gradYear, double gradeEnglish, double gradeMath, double gradeScience, double gradeFineArts, double gradeSocialScience){

        this.firstName=firstName;
        this.lastName=lastName;
        this.name = "First Name = "+firstName+"\nLast Name = "+lastName;
        this.gradYear=gradYear;
        this.classGrades=new double[5];
        this.classGrades[0]=gradeEnglish;
        this.classGrades[1]=gradeMath;
        this.classGrades[2]=gradeScience;
        this.classGrades[3]=gradeFineArts;
        this.classGrades[4]=gradeSocialScience;

    }

    public double calcGPA(){
        double total=0.0;
        for(int index =0; index<classGrades.length;index++){

            total+=classGrades[index];

        }

        total=total/classGrades.length;
        return total;

    }

    public String toString(){
        double letGrade = calcGPA();
        String letter = "";
        String studentInfo=new String();
        String studentClasses=new String();
        String allStudentInfo=new String();

        studentInfo=name+"\n"+"Student's GPA is: "+calcGPA()+"\n"+"Student's Overall Letter Grade is: "+letter;
        studentClasses="\nEnglish = "+classGrades[0]+"\nMath = "+classGrades[1]+"\nScience = "+classGrades[2]+"\nFine Arts = "+classGrades[3]+"\nSocal Science = "+classGrades[4];
        allStudentInfo = studentInfo+studentClasses;

        return allStudentInfo;
    }

}
