import java.util.*;
public class MyPod{
    private String color;
    //private MySong[]songList;
    private ArrayList<MySong>songList;
    public MyPod(){
        this.color = new String("White");
        this.songList = new ArrayList<MySong>();
        //this.songList = new MySong[3];
    }

    public MyPod(String color){
        this.color = new String(color);
        this.songList = new ArrayList<MySong>();
        //this.songList = new MySong[3];
        this.songList.add(new MySong("Jump",5));
        this.songList.add(new MySong("Stairway to Heven",5));
        this.songList.add(new MySong("Insignia",5));
        this.songList.add(new MySong("uptown funk",5));

        //songList[0] = new MySong("Jump",5);
        //songList[1] = new MySong("Stairway to Heven",5);
        //songList[2] = new MySong("Insignia",5);
        //songList[3] = new MySong("uptown funk",5);
        
        System.out.println("The size of ArrayList is: "+this.songList.size());
    }

    public String toString(){
        String output = new String();
        output = "The color of this MyPod is: "+color+"\n";

        for(MySong song: songList){
            output+=song+"\n";
        }
        return output;
    }
}
