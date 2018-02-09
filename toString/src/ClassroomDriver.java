public class ClassroomDriver{

    public static void main(){

        Classroom Baek = new Classroom();
        Baek.addStudent(new Student("Spencer",10));
        Baek.addStudent(new Student("Stefanie",11));
        Baek.addStudent(new Student("Chris",11));
        Baek.addStudent(new Student("Thomas",11));
        Baek.addStudent(new Student("Ben",12));
        Baek.addStudent(new Student("Walter",11));
        Baek.addStudent(new Student("Robert",11));
        Baek.addStudent(new Student("Cullen",11));

        System.out.println(Baek);

    }

}