public class Student{
    
    private String name;
    private int gradeLevel;
    
    public Student(String name, int gr){
        
        this.name=name;
        this.gradeLevel=gr;
        
    }//end Constructor
    
    public String toString(){
        
        return "My name is "+name+" and I'm in grade "+gradeLevel;
        
    }//end String
    
}
