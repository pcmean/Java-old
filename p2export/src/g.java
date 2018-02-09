public class g{
    public static void main(){
        String[] favoriteArtists= {"Darude Sandstorm","Break Them","Valkyrie"};
        int max4=2;
        int min4=0;
        int range4 = (max4 - min4) + 1;
        int index3;
        index3 = (int)(Math.random() * range4) + min4;
        System.out.println(index3);
        favoriteArtists[index3]=("Michael Jackson");
        //System.out.println(favoriteArtists[index]);
        for(int ctr=0;ctr<favoriteArtists.length;ctr++){
            if(favoriteArtists[ctr].equals("Michael Jackson")){
                System.out.println("We found Michael Jackson");
                ctr=3;
            }
            else{
                System.out.println("No Michael Jackson here");
            }
        }
    }
}
