public class ForEachLoop1{
    
    public static void main(){
        
        int thanksGiving[]={3,4,5,6,7};
        int total=0;
        
        for(int x: thanksGiving){
            
            total+=x;
            
        }
        System.out.println(total);
    }
    
}
