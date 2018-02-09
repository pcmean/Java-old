import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import javax.xml.bind.DatatypeConverter;
public class P5E_Jukebox{
    public MySong[][]songList;
    public MySong[]playList;
    int r1;
    int r2;
    int dowhile1=1;
    int howToPlay;
    int songRatting=1;
    int play=0;
    int ctr=0;
    int disNum=0;
    MySong SongOut;
    public P5E_Jukebox(){
        this.songList  = new MySong[3][4];
        songList[0][0] = new MySong("Jet Airliner",5);
        songList[0][1] = new MySong("Slide",4);
        songList[0][2] = new MySong("Tom Sawyer",3);
        songList[0][3] = new MySong("Purple Rain",2);
        songList[1][0] = new MySong("Sing a Song",1);
        songList[1][1] = new MySong("Baba O'Riley",5);
        songList[1][2] = new MySong("Jumper",4);
        songList[1][3] = new MySong("Car Wash",3);
        songList[2][0] = new MySong("Kung Fu Fighting",2);
        songList[2][1] = new MySong("Right as Rain",4);
        songList[2][2] = new MySong("Beat It",5);
        songList[2][3] = new MySong("Bust a Move",4);
        for(int row=0; row<songList.length; row++){
            for(int col=0; col<songList[0].length;col++){
                System.out.print(songList[row][col]+"\n");                
            }
            System.out.println("\n");
        }
        while(dowhile1 == 1){
            try{
                howToPlay= Integer.parseInt(JOptionPane.showInputDialog("Play songs based opon random(1), rateing(2)or exit(3)"));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "What was that?","Thats not a number!",JOptionPane.WARNING_MESSAGE);
            }
            if(howToPlay==1){
                r1=(int) ((Math.random())*3);
                r2=(int) ((Math.random())*3);
                System.out.print(songList[r1][r2]+"\n"); 
            }
            
            //ratting songs
            
            else if(howToPlay==2){
                try{
                    songRatting= Integer.parseInt(JOptionPane.showInputDialog("How many stars do you want the song have"));
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "What was that?","Thats not a number!",JOptionPane.WARNING_MESSAGE);
                }
                play=0;
                for(int row=0; row<songList.length; row++){
                    for(int col=0; col<songList[0].length;col++){
                        if(songList[row][col].getRating()==songRatting){
                            System.out.print("Marking"+songList[row][col]+"\n");
                            play++;
                        }
                    }
                }
                this.playList = new MySong[play];
                ctr=0;
                for(int row=0; row<songList.length; row++){
                    for(int col=0; col<songList[0].length;col++){
                        if(songList[row][col].getRating()==songRatting){
                            System.out.print("adding"+songList[row][col]+"\n");
                            playList[ctr] =((songList[row][col]));
                            ctr++;
                        }
                    }
                }
                System.out.print("\n\n\n\n");
                if(play>0){
                    for(int index=0; index<playList.length; index++){
                        disNum=index+1;
                        System.out.println(playList[index]+"\n");                
                    }
                }
                else{
                    System.out.println("No songs for that ratting!"); 
                }
            }
            else if(howToPlay==3){
                dowhile1=2;
            }
            else{
                JOptionPane.showMessageDialog(null, "What was that?","I dont understand!",JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public String toString(){
        String output = new String();
        output = "";

        return output;
    }

}