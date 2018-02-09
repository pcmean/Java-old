public class Student{

    private String name;
    private int gradYear;
    private double[] classGrades;

    public Student(){
        name=new String("");
        gradYear=0;
        classGrades=new double[5];

    }

    public Student(String name, int gradYear, double gradeEnglish, double gradeMath, double gradeScience, double gradeFineArts, double gradeSocialScience){

        this.name=name;
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
        String letter = "";;
        String studentInfo=new String();
        
        if(letGrade==4.0){
            
            letter = "A";
            
        }else if(letGrade<4.00 && letGrade>3.69){
            
            letter = "A-";
            
        }else if(letGrade<3.70 && letGrade>3.29){
            
            letter = "B+";
            
        }else if(letGrade<3.30 && letGrade>2.99){
            
            letter = "B";
            
        }else if(letGrade<3.00 && letGrade>2.69){
            
            letter = "B-";
            
        }else if(letGrade<2.70 && letGrade>2.29){
            
            letter = "C+";
            
        }else if(letGrade<2.30 && letGrade>1.99){
            
            letter = "C";
            
        }else if(letGrade<2.00 && letGrade>1.69){
            
            letter = "C-";
            
        }else if(letGrade<1.70 && letGrade>1.29){
            
            letter = "D+";
            
        }else if(letGrade<1.30 && letGrade>0.99){
            
            letter = "D";
            
        }else if(letGrade<1.00 && letGrade>0.69){
            
            letter = "D-";
            
        }else if(letGrade<0.70 && letGrade>0.29){
            
            letter = "F";
            
        }else{
            
            letter = "F-";
            
        }
        studentInfo="Student's name is: "+name+"\n"+"Student's GPA is: "+calcGPA()+"\n"+"Student's Letter Grade is: "+letter+"\n"+"Student's Graduation year is: "+gradYear;

        return studentInfo;
    }

}
