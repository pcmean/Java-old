public class f{
    public static void main(){
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
}