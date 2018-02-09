public class CircleTest{
    public static void main(){
        Circle c1=new Circle(5);
        Circle c2=new Circle(4);

        System.out.println("Area of circle 1 is: "+c1.getArea());
        System.out.println("Area of circle 2 is: "+c2.getArea());

        System.out.println("the value of compareTo() is: "+ c1.compareTo(c2));

        if(c1.compareTo(c2)<0){ System.out.println("The area of c1 is less than c2");}
        else if(c1.compareTo(c2)==0){ System.out.println("The area of c1 is equal to c2");}
        else if(c1.compareTo(c2)>0){ System.out.println("The area of c1 is greater than c2");}
            else{System.out.println("NULL");}
        }
    }