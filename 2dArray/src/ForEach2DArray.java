public class ForEach2DArray
{
    
    public static void main(){
        
        int [][]numbers=new int[5][5];
        
        for(int row=0; row<numbers.length;row++){
            for(int col=0; col<numbers[0].length;col++){

                numbers[row][col]=row+col;               

            }
        }
        for(int[]row: numbers){
            for(int num: row){

                System.out.print(num+" ");                

            }
            System.out.print("\n");
        }
    }
    
}
