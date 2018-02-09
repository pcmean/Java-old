public class Circle{
    private int radius;
    public Circle(){
        radius=0;
    }

    public Circle(int radius){
        this.radius=radius;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }

    public int compareTo(Object o){
        Circle tempCircle=(Circle) o;
        if(getArea()<tempCircle.getArea()){
            return -1;
        }else if(getArea()>tempCircle.getArea()){
            return 1;
        }else{
            return 0;
        }
    }
}
