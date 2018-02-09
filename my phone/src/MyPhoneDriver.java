public class MyPhoneDriver{
    public static void main(){
        //int num = 5;
        MyPhone myOtherCell=new MyPhone();
        MyPhone myCell = new MyPhone(64,99.99,"Verizon",false);
        System.out.println(myCell+"\n");
        System.out.println(myOtherCell);
    }
}
