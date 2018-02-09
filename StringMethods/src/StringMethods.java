import java.util.Scanner;

class StringMethods{

    public static void main(){

        Scanner input = new Scanner(System.in);

        while(true){

            
            System.out.println("Testing String methods...");

            String statement = input.nextLine();

            System.out.println("You typed: "+statement);
            System.out.println("The length of string "+statement+" is: "+statement.length());
            System.out.println("The result of subtstring "+statement+" is: "+statement.substring(3));
            System.out.println("The result of subtstring "+statement+" is: "+statement.substring(3,6));
            System.out.println("The result of indexOf "+statement+" is: "+statement.indexOf("pute"));
            System.out.println("The result of trim() "+statement+" is: "+statement.trim());
            System.out.println("The result of toLowerCase "+statement+" is: "+statement.toLowerCase());
            System.out.println("The result of toUpperCase "+statement+" is: "+statement.toUpperCase());

            statement = input.nextLine();
            System.out.println('\u000C');//ONLY WORKS IN BLUEJ

        }

    }//end method main
}//end class