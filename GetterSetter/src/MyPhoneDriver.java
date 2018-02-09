public class MyPhoneDriver{
    public static void main(){
        //int num = 5;
        MyPhone myCell=new MyPhone();
        MyPhone homeCell = new MyPhone(64,99.99,"green",false);
        
        System.out.println("My phone stats"+myCell+"\n");
        System.out.println("My phone stats"+homeCell);
        
        System.out.println("\n\n");
        System.out.println(myCell.getMemCap());
        myCell.setMemCap(32);
        System.out.println(myCell.getMemCap());
        System.out.println(myCell);
        
    }
    
    
}
