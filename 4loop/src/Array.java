public class Array{
    public static void main(String[] args){
        int[]nums=new int [12];
        for(int index=0; index<nums.length; index++){
            nums[index]=index*2;
          //System.out.println("Ann was "+ctr+" years old");  
        }//end for
        for(int index=0; index<nums.length; index++){
            System.out.println("The value is: "+nums[index]);  
        }//end for
    }//end main
}//end all