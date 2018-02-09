public class ComparringStrings
{

    public static void main(){

        String s1 = new String("apple");
        String s2 = new String("banana");

        System.out.println(s1.compareTo(s2));//compares in the alphabetical order

        s1 = new String("aaaaa");
        s2 = new String("aaaab");

        System.out.println(s1.compareTo(s2));

        s1 = new String("aaaaa");
        s2 = new String("aaaaa");

        System.out.println(s1.compareTo(s2));

    }

}
