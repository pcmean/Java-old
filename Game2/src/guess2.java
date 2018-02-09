import java.util.*;

public class guess2 {
	static int number;
    static int guess;
    static Scanner scan;
    static Random rand;
	public static void main(String[] args) {
		 scan=new Scanner(System.in);
		 rand=new Random();
		 System.out.println("please enter max number");
		 int max=scan.nextInt();
		 number = rand.nextInt(max+1);
		 String Output ="";
		 System.out.println("Start Guessing!");
		 int cnt = 0;
		 String out2 = "you ran out of guesses";
		 while(true){
	            guess= scan.nextInt();
	            if(guess<number){Output=". You are to low.";}
	            if(guess>number){Output=". You are to high.";}
	            if(guess==number){cnt=200; out2 = "well done";}
	            System.out.println(number==guess?"Correct":"Incorrect"+Output+" Guess again!");
	            cnt++;
	            if(cnt>25){
	            	System.out.println(out2);
	            	break;
	            }
	    }
		 
		

	}

}
