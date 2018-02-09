public class QuadraticEquation{

    private int a;
    private int b;
    private int c;

    public QuadraticEquation(){
        this.a=0;
        this.b=0;
        this.c=0;

    }

    public QuadraticEquation(int a, int b, int c){

        this.a=a;
        this.b=b;
        this.c=c;

    }

    public int getB(){

        return b;

    }

    public void setB(int b){

        this.b=b;

    }

    public int calcDiscriminant(){

        int discriminant=(b*b)-(4*a*c);
        return discriminant;

    }

    public double calcRoot1(){

        double answer = ((-b)+Math.sqrt(calcDiscriminant()))/(2*a);
        return answer;

    }

    public double calcRoot2(){

        //double answer = ((-b)+(-1*(Math.sqrt(calcDiscriminant()))/(2*a)));
        double answer = ((-b)+(-1)*Math.sqrt(calcDiscriminant()))/(2*a);

        return answer;

    }

    public String toString(){

        String equation = new String(" ");
        if(calcDiscriminant()>=0){
            equation = "The quadratic equation is: "+a+"x^2+"+b+"x+"+c+"=0"+"\n"+"The discriminant is: "+calcDiscriminant()+"\n"+"Root 1 is: "+calcRoot1()+"\n"+"Root 2 is: "+calcRoot2();

        }
        if(calcDiscriminant()<0){
            equation = "The quadratic equation is: "+a+"x^2+"+b+"x+"+c+"=0"+"\n"+"The discriminant is: "+calcDiscriminant()+"\n"+"Root 1 is: "+calcRoot1()+"\n"+"Root 2 is: "+calcRoot2();

        }
        
        return equation;
    }

}
