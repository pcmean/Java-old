import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import javax.xml.bind.DatatypeConverter;
public class all{
    public static void Main(){
        JTextField userName = new JTextField();
        JTextField password = new JPasswordField();
        JTextField forgot = new JTextField();

        String CUN = new String ("A");
        String CPW = new String ("1");
        String unToMatch = CUN;
        String pwToMatch = CPW;
        String fpwun;

        String UN;
        String PW;
        int pwlength;

        int doWhile1 = 0;
        int doWhile2 = 0;
        int doWhile3 = 0;
        int doWhile4 = 0;
        String runClass;
        Scanner scan = new Scanner(System.in);
        JTextField classToRun = new JTextField();

        String wait;

        int option1;
        int option2;
        int option3;
        int option4;
        int option5;
        int option6;
        int option7;
        int option8;
        int option9;
        int option10;
        int option11;
        int option12;
        int option13;
        String message5;

        //------------------------------------------------------------------------------------------------------//
        //------------------------------------------------------------------------------------------------------//
        //------------------------------------------------------------------------------------------------------//
        //------------------------------------------------------------------------------------------------------//
        //------------------------------------------------------------------------------------------------------//
        //------------------------------------------------------------------------------------------------------//

        while(doWhile1 == 0){
            //userName.setText("");
            password.setText("");
            Object[] message1 = {
                    "Username:", userName,
                    "Password:", password
                };

            option1 = JOptionPane.showConfirmDialog(null, message1, "Login", JOptionPane.OK_CANCEL_OPTION);

            UN= userName.getText();
            PW= password.getText();
            //System.out.println(option1);

            if(option1==0 && UN.equals(unToMatch) && PW.equals(pwToMatch)){
                doWhile2 = 0;
                while(doWhile2 == 0){

                    Object[] message2 = {
                            "Project to run: \n a, b, c, d, e, f, \n to exit type exit or press ESC on the keyboard", classToRun};

                    option2 = JOptionPane.showConfirmDialog(null, message2, "Project to Run", JOptionPane.DEFAULT_OPTION);
                    runClass = classToRun.getText();
                    //System.out.println(option2);

                    System.out.println('\u000C');//clears termanal but ONLY WORKS IN BLUEJ

                    if(runClass.equalsIgnoreCase("exit") || option2 <0){
                        doWhile2=1;
                        doWhile1=1;
                        break;
                    }
                    else if(runClass.equalsIgnoreCase("a")||runClass.equalsIgnoreCase("p3a")){

                        Clock bedroomClock = new Clock();
                        System.out.println(bedroomClock);
                        int hour=0;
                        int minute=0;
                        int second=0;
                        while(doWhile3==0){
                            try{

                                hour=Integer.parseInt(JOptionPane.showInputDialog("What is the current hour?"));
                                minute=Integer.parseInt(JOptionPane.showInputDialog("What is the current minute?"));
                                second= Integer.parseInt(JOptionPane.showInputDialog("What is the current seccond?"));
                                doWhile3++;

                            }catch(Exception e){

                                JOptionPane.showMessageDialog(null, "What was that?","",JOptionPane.WARNING_MESSAGE);

                            }
                        }

                        bedroomClock.setTime(hour, minute, second);
                        System.out.println(bedroomClock);

                        int counter = 0;
                        while(counter==0){

                            Object[] message3 = {
                                    "Is it daylight savings time"
                                };

                            option3 = JOptionPane.showConfirmDialog(null, message3, "Day Light Savings Time", JOptionPane.YES_NO_OPTION);
                            if(option3 == 0){

                                bedroomClock.setDaylightSaving(hour);
                                counter++;

                            }else if(option3 == 1){

                                counter++;

                            }else{

                                Object[] message4 = {
                                        "What on earth was that?\nPlease enter click yes or no"
                                    };
                                option4 = JOptionPane.showConfirmDialog(null, message4, "Error", JOptionPane.DEFAULT_OPTION);

                            }

                        }
                        System.out.println(bedroomClock);
                        //Clock bedroomClock = new Clock();
                        ClockStore mts = new ClockStore();
                        message5 = "The clock with the greatest time is clock "+Integer.toString(ClockStore.mostSeconds())+".";
                        option5 = JOptionPane.showConfirmDialog(null, message5, "Clock with greates time.", JOptionPane.DEFAULT_OPTION);

                    }else if(runClass.equalsIgnoreCase("b")||runClass.equalsIgnoreCase("p3b")){

                        Student student= new Student( "Mickey", "Mouse", 2014, 4.0, 4.0, 3.5, 3.0, 3.0) ;
                        System.out.println(student);
                        System.out.println("\n\n");

                        student.setGPA( 4.0, 4.0, 4.0, 4.0, 4.0 );
                        System.out.println(student);
                        System.out.println("\n\n");
                        
                        Roster classOf2014=new Roster();
                        System.out.println(classOf2014);

                    }else if(runClass.equalsIgnoreCase("c")||runClass.equalsIgnoreCase("p3c")){
                    }else if(runClass.equalsIgnoreCase("d")||runClass.equalsIgnoreCase("p3d")){
                    }else if(runClass.equalsIgnoreCase("e")||runClass.equalsIgnoreCase("p3e")){
                    }else if(runClass.equalsIgnoreCase("f")||runClass.equalsIgnoreCase("p3f")){
                        Roster2 APComputerScience=new Roster2();
                        System.out.println(APComputerScience);
                        
                        APComputerScience.addStudent(new Student("Minnie","Mouse",2014,3.0,3.0,3.0,3.0,3.0));
                        APComputerScience.addStudent(new Student("Bob","Moe",2014,3.0,3.0,3.0,3.0,3.0));
                        APComputerScience.addStudent(new Student("James","Go",2014,4.0,4.0,4.0,4.0,4.0));
                        
                        System.out.println(APComputerScience);
                        
                        APComputerScience.dropStudent("Go");
                        APComputerScience.dropStudent("Mouse");
                        
                        System.out.println(APComputerScience);
                        
                    }else if(option2==-1){
                        doWhile2=1;
                        doWhile1=1;
                        break;
                    }else if(runClass==null){
                        Object[] message6 = {
                                "sorry I dont understand, I am only a computer."
                            };

                        option6 = JOptionPane.showConfirmDialog(null, message6, "Error", JOptionPane.DEFAULT_OPTION);
                    }else{
                        Object[] message7 = {
                                "sorry I dont understand, I am only a computer."
                            };

                        option7 = JOptionPane.showConfirmDialog(null, message7, "Error", JOptionPane.DEFAULT_OPTION);
                    }
                }
            }
            else if(option1==2 || option1== -1){
                doWhile1=1;
                break;
            }
            else{
                Object[] message8 = {
                        "Sorry you entered the wrong username or password."+"\n"+
                        "Did you forget your username or password?"
                    };
                option8 = JOptionPane.showConfirmDialog(null, message8, "Error", JOptionPane.YES_NO_OPTION);
                //System.out.println(option8);
                if(option8 == 0){
                    doWhile4 = 0;
                    while(doWhile4 == 0){

                        Object[] message9 = {
                                "What did you forget Username or Password?\nPlease type (UN) or (PW)"
                            };
                        option9 = JOptionPane.showConfirmDialog(null, message9, "Error", JOptionPane.DEFAULT_OPTION);
                        System.out.println(option8);

                        fpwun= forgot.getText();
                        if(fpwun.equalsIgnoreCase("un")){

                            Object[] message10 = {
                                    "your password is: "+unToMatch
                                };
                            option10 = JOptionPane.showConfirmDialog(null, message10, "Error", JOptionPane.DEFAULT_OPTION);
                            System.out.println(option10);

                        }
                        else if(fpwun.equalsIgnoreCase("pw")){

                            Object[] message11 = {
                                    "your password is: "+pwToMatch
                                };
                            option11 = JOptionPane.showConfirmDialog(null, message11, "Error", JOptionPane.DEFAULT_OPTION);
                            System.out.println(option11);

                        }
                        else if(fpwun.equals("-1") || fpwun.equals("2")||fpwun.equalsIgnoreCase("exit")){

                            doWhile4 = 1;

                        }
                        else{

                            Object[] message12 = {
                                    "Sorry i dont understand"
                                };
                            option12 = JOptionPane.showConfirmDialog(null, message12, "Error", JOptionPane.DEFAULT_OPTION);
                            System.out.println(option12);

                        }
                    }
                }
            }
        }
    }
}