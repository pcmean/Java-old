public class e{
    public static void main(){
        int[]nums1=new int [50];
        for(int index=0; index<nums1.length; index++){
            nums1[index]= (int)(Math.random() * 101);
        }//end for
        for(int index=0; index<nums1.length; index++){
            System.out.print(" "+nums1[index]);
        }//end for
    }//end main
}//end all