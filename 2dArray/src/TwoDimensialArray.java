public class TwoDimensialArray{
    public static void main(){

        int [][]grid=new int[3][4];

        for(int row=0; row<grid.length;row++){
            for(int col=0; col<grid[0].length;col++){

                grid[row][col]=row+col;

            }
        }
        
        for(int row=0; row<grid.length;row++){
            for(int col=0; col<grid[0].length;col++){

                System.out.print(grid[row][col]+" ");                

            }
            System.out.print("\n");
        }
    }
}
