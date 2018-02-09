public class a{
    public static void main(){
        int[]numa=new int []{1,2,3,4,5,6,7,8,9,10,11};
        int[]numb=new int []{11,10,9,8,7,6,5,4,3,2,1};
        int a;
        int b;
        for(int ctr=0;ctr<10; ctr++){
            a=numa[ctr];
            b=numb[ctr];
            if(a<b){
                System.out.println(a+" (a) is less than "+b+" (b)");

            }
            else if(a==b){
                System.out.println(a+" (a) is the same as "+b+" (b)");

            }
            else if(a>b){
                System.out.println(a+" (a) is greater than "+b+" (b)");

            }
        }
    }
}
