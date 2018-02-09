public class c{
    public static void main(){
        int square1;
        int random1;
        int range1;
        for(int ctr=0; ctr<11; ctr++){
            square1= ctr*ctr;
            range1 = (square1 - ctr);     
            random1= (int)(Math.random() * range1) + ctr;
            System.out.println(ctr+"\t"+square1+"\t"+random1);
        }//end for
    }
}
