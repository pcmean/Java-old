import java.awt.*;
import java.util.*;
import java.io.*;
import javax.xml.*;

public class Roster{
    private ArrayList<Student>Students;

    public Roster(){
        //Student Student = new Student("John","Doe",2016, 3,4,3,3,4);
        //Student Student1 = new Student("Random","Name",2016,3,4,5,3,4);
        //Student Student2 = new Student("Bill", "Johnson", 2016,3,2,3,4,3);
        this.Students = new ArrayList<Student>();
        this.Students.add(new Student("John","Doe",2016, 3,4,3,3,4));
        this.Students.add(new Student("Random","Name",2016,3,4,5,3,4));
        this.Students.add(new Student("Bill", "Johnson", 2016,3,2,3,4,3));

    }

    protected String findStudentWithMaxGPA(){
        Student withMaxGPA = new Student();
        for(Student s:Students){
            if(s.calcGPA() > withMaxGPA.calcGPA()){
                withMaxGPA = s;
            }
        }

        String first = withMaxGPA.firstName;
        String last = withMaxGPA.lastName;
        String fullName = first+" "+last;
        return fullName;
    }

    public String toString(){
        return findStudentWithMaxGPA();
    }
}