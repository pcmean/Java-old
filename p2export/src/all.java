import java.util.Scanner;
public class all{
    public static void main(){
        //A
        int[]numa=new int []{1,2,3,4,5,6,7,8,9,10,11};
        int[]numb=new int []{11,10,9,8,7,6,5,4,3,2,1};
        int a;
        int b;
        //B
        //NONE
        //C
        int square1;
        int random1;
        int range1;
        //D
        String[] movieNames= {"UP","alliens of the deep","?? I dont watch movies ??"};
        String[] musicNames= {"Darude Sandstorm","Break Them","Valkyrie"};
        int ctr2 = 0;
        //E
        int[]nums1=new int [50];
        //F
        int[]nums3=new int [10];
        int evenNum=0;
        int max2=100;
        int min2=1;
        int range2 = (max2 - min2) + 1;  
        int max3=9;
        int min3=0;
        int range3 = (max3 - min3) + 1;
        int c;
        //G
        String[] favoriteArtists= {"Darude Sandstorm","Break Them","Valkyrie"};
        int max4=2;
        int min4=0;
        int range4 = (max4 - min4) + 1;
        int index3;
        index3 = (int)(Math.random() * range4) + min4;
        System.out.println("G index equals "+index3);
        favoriteArtists[index3]=("Michael Jackson");
        //H
        String userName = "admin";
        String passWord = "password";
        System.out.println("Enter your username ");
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        System.out.println("Enter the password for "+username);
        String pw = scan.nextLine();
        //END DECLARATION

        //START CODE

        //------------------------------------------------------------------------------------------------------------------------        
        System.out.println("FINISHED DECLARING"+"\n"+"\n"+"\n"+"\n"+"STARTING A"+"\n");
        //------------------------------------------------------------------------------------------------------------------------

        for(int ctr=0;ctr<10; ctr++){
            a=numa[ctr];
            b=numb[ctr];
            if(a<b){
                System.out.println(a+" (a) is less than "+b+" (b)");

            }
            else if(a==b){
                System.out.println(a+" (a) is the same as "+b+" (b)");

            }
            else if(a>b){
                System.out.println(a+" (a) is greater than "+b+" (b)");

            }
        }

        //------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n"+"FINISHED A"+"\n"+"\n"+"\n"+"\n"+"STARTING B"+"\n");
        //------------------------------------------------------------------------------------------------------------------------

        for(int d=0; d<100; d++){
            if ( (d % 2) == 0){
                System.out.println(d+" is even");
            }
            else{
                System.out.println(d+" is odd");
            }
        }

        //------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n"+"FINISHED B"+"\n"+"\n"+"\n"+"\n"+"STARTING C"+"\n");
        //------------------------------------------------------------------------------------------------------------------------

        for(int ctr=0; ctr<11; ctr++){
            square1= ctr*ctr;
            range1 = (square1 - ctr);     
            random1= (int)(Math.random() * range1) + ctr;
            System.out.println(ctr+"\t"+square1+"\t"+random1);
        }

        //------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n"+"FINISHED C"+"\n"+"\n"+"\n"+"\n"+"STARTING D"+"\n");
        //------------------------------------------------------------------------------------------------------------------------

        for(int index=0; index<movieNames.length; index++){
            System.out.println(movieNames[index]);
        }
        System.out.println("\n");
        while(ctr2<3){
            System.out.print(musicNames[ctr2]+", ");
            ctr2++;
        }

        //------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n"+"FINISHED D"+"\n"+"\n"+"\n"+"\n"+"STARTING E"+"\n");
        //------------------------------------------------------------------------------------------------------------------------

        for(int index=0; index<nums1.length; index++){
            nums1[index]= (int)(Math.random() * 101);
        }//end for
        for(int index=0; index<nums1.length; index++){
            System.out.print(" "+nums1[index]);
        }//end for

        //------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n"+"FINISHED E"+"\n"+"\n"+"\n"+"\n"+"STARTING F"+"\n");
        //------------------------------------------------------------------------------------------------------------------------

        for(int index=0; index<nums3.length; index++){
            nums3[index]= (int)(Math.random() * range2) + min2;
            System.out.println("made random num");
        }
        System.out.println("made all random nums3");
        for(int ctr=0;ctr<10;ctr++){
            c = (int)(Math.random() * range3) + min3;
            nums3[c] = nums3[c] * -1;
        }
        System.out.println("Turned some random numbers negative."+"\n");
        for(int index=0; index<nums3.length; index++){
            if ( nums3[index] < 0){
                System.out.println(nums3[index]);
                evenNum++;
            }
            else{
                System.out.println(nums3[index]);
            }
        }//end for
        System.out.println("There are "+evenNum+" even negative numbers.");

        //------------------------------------------------------------------------------------------------------------------------
        System.out.println("FINISHED F"+"\n"+"\n"+"\n"+"\n"+"STARTING G"+"\n");
        //------------------------------------------------------------------------------------------------------------------------

        for(int ctr=0;ctr<favoriteArtists.length;ctr++){
            if(favoriteArtists[ctr].equals("Michael Jackson")){
                System.out.println("We found Michael Jackson");
                ctr=3;
            }
            else{
                System.out.println("No Michael Jackson here");
            }
        }

        //------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n"+"FINISHED G"+"\n"+"\n"+"\n"+"\n"+"STARTING H"+"\n");
        //------------------------------------------------------------------------------------------------------------------------

        if(userName.equals(username) && passWord.equals(pw)){
            System.out.println("Welcome User");
        }
        else{
            System.out.println("ERROR");
            System.out.println("Your Username or Password is incorect");
        }

        //------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n"+"FINISHED H"+"\n"+"\n"+"\n"+"\n"+"DONE");
    }
}