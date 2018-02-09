import java.util.ArrayList;
public class PetDriver{
    public static void main(){
        Dog dug=new Dog("Dug");
        Cat lester=new Cat("Lester");
        LoudDog red=new LoudDog("Red");
        
        System.out.println(dug.speak());
        System.out.println(lester.speak());
        System.out.println(red.speak());
        
        ArrayList<Pet>animals=new ArrayList<Pet>();
        animals.add(dug);
        animals.add(lester);
        animals.add(red);
        for(Pet p: animals){
            System.out.println(p.speak());
        }
    }
}
