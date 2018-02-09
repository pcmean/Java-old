import java.util.*;
public class Classroom{

    private ArrayList<Student>myClass;

    public Classroom(){

        myClass=new ArrayList<Student>();

    }

    public void addStudent(Student s){

        myClass.add(s);

    }

    public String toString(){

        String temp = new String();

        for(Student s: myClass){

            temp+=s.toString()+"\n";

        }
        return temp;
    }

}