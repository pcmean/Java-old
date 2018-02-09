public class Array2D{
    public static void main(String[] args){

        Time[][]myTimes=new Time[4][5];
        //System.out.println("Starting to print times into Array");
        for(int row=0;row<myTimes.length;row++){
            for(int col=0;col<myTimes[0].length;col++){
                    try{
                        System.gc();
                myTimes[row][col]=new Time(row,col);
            }catch(Exception e){
                    System.out.print(row+","+col);
                }

            } 
        }
        System.out.println("Done printing times into Array");
        for(int row=0;row<myTimes.length;row++){
            for(int col=0;col<myTimes[0].length;col++){

                System.out.print(myTimes[row][col]+"\t");

            }
            System.out.println("");
        }

    }
}
