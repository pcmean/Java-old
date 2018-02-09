
public class PhysicsDriver
{
    public static void main(){
        Einstein albert = new Einstein();
        System.out.println(albert.calcEnergy(1.5)+"[joules]");
        System.out.println(albert.wordsOfWisdom());    

        System.out.println(Einstein.calcEnergy(1.5)+"[joules]");
        System.out.println(Einstein.wordsOfWisdom());

    }

}
