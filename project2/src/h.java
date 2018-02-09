import java.util.Scanner;
public class h{
    public static void main(){
        String userName = "admin";
        String passWord = "password";
        System.out.println("Enter your username ");
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        System.out.println("Enter the password for "+username);
        String pw = scan.nextLine();
        if(userName.equals(username) && passWord.equals(pw)){
            System.out.println("Welcome User");
        }
        else{
            System.out.println("ERROR");
            System.out.println("Your Username or Password is incorect");
        }
    }
}
