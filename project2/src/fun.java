import java.util.Scanner;
public class fun{
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

        int langth=10;
        int[]nums3=new int [langth];
        int evenNum=0;

        int max2=100;
        int min2=1;
        int range2 = (max2 - min2) + 1;  
        int max3=9;

        int min3=0;
        int range3 = (max3 - min3) + 1;

        int c;
        int positive;

        //G

        String[] favoriteArtists= {"Darude Sandstorm","Break Them","Valkyrie"};
        int max4=2;
        int min4=0;
        int range4 = (max4 - min4) + 1;
        int index3;
        index3 = (int)(Math.random() * range4) + min4;
        //System.out.println("G index equals "+index3);
        favoriteArtists[index3]=("Michael Jackson");

        //H

        String userName = "admin";
        String passWord = "password";
        System.out.println("Enter your username ");
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        System.out.println("Enter the password for "+username);
        String pw = scan.nextLine();
        String runClass;
        //i

        int number = 7;
        int copy = 20;

        //------------------------------------------------------------------------------------------------------------------------        

        System.out.println("FINISHED DECLARING"+"\n");

        //------------------------------------------------------------------------------------------------------------------------

        System.out.println('\u000C');//ONLY WORKS IN BLUEJ

        if(userName.equals(username) && passWord.equals(pw)){
            System.out.println("Welcome User"+"\n");

            while(true){
                System.out.println("what class would you like to run?"+"\n"+"a, b, c, d, e, f, g, h");
                System.out.println("MUST BE PRINTED EXZACTLY"+"\n");

                runClass = scan.nextLine();

                System.out.println('\u000C');//ONLY WORKS IN BLUEJ

                if(runClass.equals("a")){

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

                }
                else if(runClass.equals("b")){

                    for(int d=0; d<100; d++){
                        if ( (d % 2) == 0){
                            System.out.println(d+" is even");
                        }
                        else{
                            System.out.println(d+" is odd");
                        }
                    }

                }
                else if(runClass.equals("c")){

                    for(int ctr=0; ctr<11; ctr++){
                        square1= ctr*ctr;
                        range1 = (square1 - ctr);     
                        random1= (int)(Math.random() * range1) + ctr;
                        System.out.println(ctr+"\t"+square1+"\t"+random1);
                    }

                }
                else if(runClass.equals("d")){

                    for(int index=0; index<movieNames.length; index++){
                        System.out.println(movieNames[index]);
                    }
                    System.out.println("\n");
                    while(ctr2<3){
                        System.out.print(musicNames[ctr2]+", ");
                        ctr2++;
                    }

                }
                else if(runClass.equals("e")){

                    for(int index=0; index<nums1.length; index++){
                        nums1[index]= (int)(Math.random() * 101);
                    }//end for
                    for(int index=0; index<nums1.length; index++){
                        System.out.print(" "+nums1[index]);
                    }

                }
                else if(runClass.equals("f")){

                    for(int index=0; index<nums3.length; index++){
                        nums3[index]= (int)(Math.random() * range2) + min2;
                        System.out.println("made random num");
                    }
                    System.out.println("made all random nums3");
                    for(int ctr=0;ctr<langth;ctr++){
                        c = (int)(Math.random() * range3) + min3;
                        nums3[c] = nums3[c] * -1;
                    }
                    System.out.println("Turned some random numbers negative.");
                    for(int index=0; index<nums3.length; index++){
                        if ( nums3[index] < 0){
                            System.out.println(nums3[index]);
                            evenNum++;
                        }
                        else{
                            System.out.println(nums3[index]);
                        }
                    }//end for
                    positive = langth- evenNum;
                    System.out.println("There are "+evenNum+" negative numbers.");
                    System.out.println("There are "+positive+" positive numbers.");

                }
                else if(runClass.equals("g")){

                    for(int ctr=0;ctr<favoriteArtists.length;ctr++){
                        if(favoriteArtists[ctr].equals("Michael Jackson")){
                            System.out.println("We found Michael Jackson");
                            ctr=3;
                        }
                        else{
                            System.out.println("No Michael Jackson here");
                        }
                    }

                }
                else if(runClass.equals("h")){

                    System.out.println("Ha you loged in to start this program."+"\n"+"So i don't see the need to do it again");

                }
                else if(runClass.equals("i")){

                    System.out.println(copy);
                    copy = number;				//copy number
                    System.out.println(copy);	//pastes number

                }
                else{

                    System.out.println("sorry I dont understand");

                }

                System.out.println("\n"+"\n"+"\n");

            }

        }
        else{

            System.out.println("ERROR");

            System.out.println("Your Username or Password is incorect"+"\n"+"So the program could not be started."+"\n");

            if(!(pw.equals(passWord))){
                System.out.println("Forget your password?"+"\n"+"Ok here it is: "+passWord+"\n"+"\n");
            }

            if(!(username.equals(userName))){
                System.out.println("Wow how could you forget your username?"+"\n"+"I guess you still need it... "+"\n"+"Here: "+userName+"\n"+"\n");
            }

            main();

        }
    }
}