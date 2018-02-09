import java.awt.*;
import java.util.*;
import java.io.*;
import javax.xml.*;

public class Roster2{

    public String firstName;
    public String lastName;
    public String name = new String(firstName +" "+ lastName);
    private ArrayList<Student>Students;

    public Roster2(){
        //Student Student1 = ("John","Doe",2016, 3,4,3,3,4);
        //Student Student2 = ("Random","Name",2016,3,4,5,3,4);
        //Student Student3 = ("Bill", "Johnson", 2016,3,2,3,4,3);

        this.Students = new ArrayList<Student>();
        this.Students.add(new Student("John","Doe",2016, 3,4,3,3,4));
        this.Students.add(new Student("Random","Name",2016,3,4,5,3,4));
        this.Students.add(new Student("Bill", "Johnson", 2016,3,2,3,4,3));

    }

    public void addStudent(Student student){

        this.Students.add(student);

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

    public void dropStudent(String lastName){
        int i = 0;
        for (Student s:Students){

            if(lastName == s.lastName){
                Students.remove(Students.get(i));
            }
            ++i;
        }
    }

    public String toString(){
        return findStudentWithMaxGPA();
    }
}