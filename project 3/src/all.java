import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import javax.xml.bind.DatatypeConverter;
public class all{
    public static void Main(){
        JTextField userName = new JTextField();
        JTextField password = new JPasswordField();
        JTextField oldPW = new JPasswordField();
        JTextField newPW = new JPasswordField();
        JTextField forgot = new JTextField();

        String CUN = new String ("Administrator");
        String CPW = new String ("1474419175");
        String unToMatch = CUN;
        String pwToMatch = CPW;

        String UN;
        String PW;
        String OPW;
        String NPW;
        String fpwun;
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
        int option14;

        //------------------------------------------------------------------------------------------------------//
        //p3c
        String school1 = new String ("Stanford");
        String school2 = new String ("Oregon");
        String school3 = new String ("UCLA");

        //------------------------------------------------------------------------------------------------------//
        //------------------------------------------------------------------------------------------------------//
        //------------------------------------------------------------------------------------------------------//
        //------------------------------------------------------------------------------------------------------//
        //------------------------------------------------------------------------------------------------------//

        int arrayD[] = new int []{1,2,3,4,5,6,7,8,9,10,11};
        int findD = 9;
        String allTheNumbers;

        String[] teachers = {"Mr. Armstrong","Mr. Holmlund","Ms. Beak","Ms. francise","Ms. Neilson"};
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
                            "Project to run: \n a, b, c, d, e, f, \n to exit type “exit” or press ESC on the keyboard", classToRun
                        };

                    option2 = JOptionPane.showConfirmDialog(null, message2, "Project to Run", JOptionPane.DEFAULT_OPTION);
                    runClass = classToRun.getText();
                    System.out.println(option2);

                    System.out.println('\u000C');//ONLY WORKS IN BLUEJ

                    if(runClass.equalsIgnoreCase("exit") || option2 <0){
                        doWhile2=1;
                        doWhile1=1;
                        break;
                    }
                    else if(runClass.equalsIgnoreCase("a")||runClass.equalsIgnoreCase("p3a")){
                        Student student1=new Student("Walter",2017,4.0,4.0,4.0,4.0,3.8);
                        System.out.println(student1+"\n\n");

                        StudentUpgrade student2=new StudentUpgrade("Walter","Hicks",2017,4.0,4.0,4.0,4.0,3.8);
                        System.out.println(student2);
                    }else if(runClass.equalsIgnoreCase("b")||runClass.equalsIgnoreCase("p3b")){

                        p3b name=new name("Walter","Hicks");
                        p3b student3=new p3b();
                        System.out.println(student3);
                        p3b student4=new p3b(4.0,4.0,4.0,4.0,3.8);
                        System.out.println(student4);

                    }else if(runClass.equalsIgnoreCase("c")||runClass.equalsIgnoreCase("p3c")){
                        System.out.println(school1.compareTo(school2));
                    }else if(runClass.equalsIgnoreCase("d")||runClass.equalsIgnoreCase("p3d")){
                        for(int index=0;index<arrayD.length; index++){

                            System.out.print(arrayD[index]+", ");

                        }
                        allTheNumbers =new String (arrayD[0]+", "+arrayD[1]+", "+arrayD[2]+", "+arrayD[3]+", "+arrayD[4]+", "+arrayD[5]+", "+arrayD[6]+", "+arrayD[7]+", "+arrayD[8]+", "+arrayD[9]+", "+arrayD[10]);
                        Object[] message14 = {
                                "What number would you like to print?"
                            };

                        option14 = JOptionPane.showConfirmDialog(null, message14, "Change Password", JOptionPane.DEFAULT_OPTION);

                        for(int index=0;index<arrayD.length; index++){
                            if(arrayD[index]==findD){
                                System.out.println(arrayD[index]+" Is in possition: "+(index+1));

                            }
                        }

                        
                    }
                    else if(runClass.equalsIgnoreCase("e")||runClass.equalsIgnoreCase("p3e")){
                        for(int index=0;index<teachers.length; index++){

                            System.out.println(teachers[index]);

                        }
                    }
                    else if(runClass.equalsIgnoreCase("f")||runClass.equalsIgnoreCase("p3f")){
                        doWhile3=0;
                        while(doWhile3 == 0){
                            oldPW.setText("");
                            newPW.setText("");
                            Object[] message3 = {
                                    "Old Password:", oldPW,
                                    "New Password:", newPW
                                };

                            option3 = JOptionPane.showConfirmDialog(null, message3, "Change Password", JOptionPane.DEFAULT_OPTION);

                            OPW= oldPW.getText();
                            NPW= newPW.getText();
                            pwlength = NPW.length();

                            if(pwlength >5){
                                if(OPW.equals(pwToMatch)){
                                    Object[] message4 = {
                                            "Your password has been changed.\n Please log back in with your new password."
                                        };

                                    option4 = JOptionPane.showConfirmDialog(null, message4, "Change Password", JOptionPane.DEFAULT_OPTION);
                                    pwToMatch = NPW;
                                    doWhile2 = 1;
                                    doWhile3 = 1;
                                }else{

                                    Object[] message5 = {
                                            "Your old password dose not match the one we have on reccord.\n Would you like to try again?"
                                        };

                                    option5 = JOptionPane.showConfirmDialog(null, message5, "Change Password", JOptionPane.YES_NO_OPTION);

                                    if(!(option5 == 0)){

                                        doWhile3 = 1;

                                    }
                                    System.out.println(option5);
                                }
                            }
                            else if(!(option3 == 0)){

                                doWhile3 = 1;

                            }
                            else{

                                Object[] message13 = {
                                        "Your new password is to short."
                                    };

                                option13 = JOptionPane.showConfirmDialog(null, message13, "Change Password", JOptionPane.DEFAULT_OPTION);

                            }
                        }
                    }
                    else if(option2==-1){
                        doWhile2=1;
                        doWhile1=1;
                        break;
                    }
                    else if(runClass==null){
                        Object[] message6 = {
                                "sorry I dont understand, I am only a computer."
                            };

                        option6 = JOptionPane.showConfirmDialog(null, message6, "Error", JOptionPane.DEFAULT_OPTION);
                    }
                    else{
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
                //System.out.println(option4);
                if(option8 == 0){
                    doWhile4 = 0;
                    while(doWhile4 == 0){

                        Object[] message9 = {
                                "What did you forget Username or Password?\nPlease type ”UN“ or ”PW“:",forgot
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