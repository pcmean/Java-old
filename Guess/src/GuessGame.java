/**
 * @author FRCTeam5678
 *
 */
import java.util.*;
public class GuessGame {
	public static int number;
    public static int guess;
    public static Scanner scan;
    public static Random rand;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        scan=new Scanner(System.in);
	        rand=new Random();
	        System.out.println("please enter max number");
	        int max=scan.nextInt();
	        number = rand.nextInt(max+1);
	        String Output ="";
	        System.out.println("Start Guessing!");
	        while(true){
	            guess= scan.nextInt();
	            if(guess<number){Output=". You are to low.";}
	            if(guess>number){Output=". You are to high.";}
	            System.out.println(number==guess?"Correct":"Incorrect"+Output+" Guess again!");        
	    }
	}
}    
