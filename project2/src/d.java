public class d{
    public static void main(){
        String[] movieNames= {"UP","alliens of the deep","?? I dont watch movies ??"};
        String[] musicNames= {"Darude Sandstorm","Break Them","Valkyrie"};
        int ctr2 = 0;
        for(int index=0; index<movieNames.length; index++){
            System.out.println(movieNames[index]);
        }
        System.out.println("\n");
        while(ctr2<3){
            System.out.print(musicNames[ctr2]+", ");
            ctr2++;
        }
    }//end for
}

