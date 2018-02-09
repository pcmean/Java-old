import java.util.*;
public class ArrayListMethods
{
    public static void main(){

        ArrayList<String>songs=new ArrayList<String>();

        songs.add("Sandstorm");
        songs.add("In the of the Mountan King");
        songs.add("Piano man");

        System.out.println("The length of the Array List is:  "+songs.size());

        for(int index=0; index<songs.size();index++){
            System.out.println(songs.get(index));
        }

        songs.remove(0);
        System.out.println("\n\nPrinting after removal!...");

        for(int index=0; index<songs.size();index++){
            System.out.println(songs.get(index));
        }

        songs.add(new String("One Love"));
        System.out.println("\n\nPrinting after addition!...");

        for(int index=0; index<songs.size();index++){
            System.out.println(songs.get(index));
        }

        songs.remove(0);
        System.out.println("\n\nPrinting after removal!...");

        for(int index=0; index<songs.size();index++){
            System.out.println(songs.get(index));
        }

        songs.add(new String("Yesterday"));
        System.out.println("\n\nPrinting after changes!...");

        for(int index=0; index<songs.size();index++){
            System.out.println(songs.get(index));
        }

        System.out.println("\n\nPrinting after changes!...");

        for(int index=0; index<songs.size();index++){
            if(songs.get(index).equals("Piano man")){
                songs.remove(index);
            }
            System.out.println(songs.get(index));
        }
    }
}
