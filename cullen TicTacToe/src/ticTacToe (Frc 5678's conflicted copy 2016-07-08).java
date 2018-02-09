import java.util.*;
public class ticTacToe{
    public static String [][]theBoard;
    public static int NPCrow, NPCcol, turn, moverow, movecol;
    public static Scanner scan;
    public static Random rand;
    
    public static void main(String[]args){
        theBoard=new String[3][3];
        scan=new Scanner(System.in);
        rand=new Random();
        boolean end=false, full=false, win=false, loose=false;
        System.out.println("Who will go first? (Player=1 Compuer=0)");
        turn=scan.nextInt();
        while(!(turn==0 || turn==1))//Decide who goes 1st
        {
            System.out.println("Use a valid number (you=1 me=0)");
            turn=scan.nextInt();
        }
        if(turn==0){//1st move NPC
            NPCrow=rand.nextInt(3);
            NPCcol=rand.nextInt(3);
            theBoard[NPCrow][NPCcol]="O";
            
            System.out.print("   1  2  3");
            for(int y=0; y<3; y++)
            {
                System.out.print("\n"+(y+1)+" ");
                for(int x=0; x<3; x++)
                {
                    if(theBoard[y][x]==null)
                    {
                        System.out.print("[ ]");
                    }
                    else
                    {
                        System.out.print("["+theBoard[y][x]+"]");
                    }
                }
            }
            System.out.println();
        }
        else if(turn==1){//1st move player
            
            System.out.println("   1  2  3"+"\n"+"1 [ ][ ][ ]"+"\n"+"2 [ ][ ][ ]"+"\n"+"3 [ ][ ][ ]"+"\n");
        }
        while(end!=true)//main game
        {
            boolean moved=false;
            while(moved==false)
            {
                System.out.println("What row? (1-3)");
                moverow=scan.nextInt();
                while(moverow>3 || moverow<1)
                {
                    System.out.println("Pick a valid row. (1-3)");
                    moverow=scan.nextInt();
                }
                System.out.println("What column?");
                movecol=scan.nextInt();
                while(movecol>3 || movecol<1)
                {
                    System.out.println("Pick a valid column. (1-3)");
                    movecol=scan.nextInt();
                }
                if(theBoard[moverow-1][movecol-1]==null)
                {
                    theBoard[moverow-1][movecol-1]="X";
                    moved=true;
                }
                else
                {
                    System.out.println("Pick an empty spot.");
                }
            }
            for(int y=0; y<3; y++)
            {
                if(theBoard[y][0]=="X" && theBoard[y][1]=="X" && theBoard[y][2]=="X")
                {
                    win=true;
                }
            }
            if(win==false)
            {
                for(int x=0; x<3; x++)
                {
                    if(theBoard[0][x]=="X" && theBoard[1][x]=="X" && theBoard[2][x]=="X")
                    {
                        win=true;
                    }
                }
            }
            if(win==false)
            {
                if(theBoard[0][0]=="X" && theBoard[1][1]=="X" && theBoard[2][2]=="X")
                {
                    win=true;
                }
            }
            if(win==false)
            {
                if(theBoard[2][0]=="X" && theBoard[1][1]=="X" && theBoard[0][2]=="X")
                {
                    win=true;
                }
            }
            if(win==false)
            {
                full=true;
                for(int y=0; y<3; y++)
                {
                    for(int x=0; x<3; x++)
                    {
                        if(theBoard[y][x]==null)
                        {
                            full=false;
                        }
                    }
                }
            }
            if(win==false && full==false)
            {
                moved=false;
                while(moved==false)
                {
                    NPCrow=rand.nextInt(3);
                    NPCcol=rand.nextInt(3);
                    if(theBoard[NPCrow][NPCcol]==null)
                    {
                        theBoard[NPCrow][NPCcol]="O";
                        moved=true;
                    }
                }
                
                System.out.println("   1  2  3");
                full=true;
                for(int y=0; y<3; y++)
                {
                    System.out.print((y+1)+" ");
                    for(int x=0; x<3; x++)
                    {
                        if(theBoard[y][x]==null)
                        {
                            System.out.print("[ ]");
                            full=false;
                        }
                        else
                        {
                            System.out.print("["+theBoard[y][x]+"]");
                        }
                    }
                    System.out.println();
                }
                for(int y=0; y<3; y++)
                {
                    if(theBoard[y][0]=="O" && theBoard[y][1]=="O" && theBoard[y][2]=="O")
                    {
                        loose=true;
                    }
                }
                if(loose==false)
                {
                    for(int x=0; x<3; x++)
                    {
                        if(theBoard[0][x]=="O" && theBoard[1][x]=="O" && theBoard[2][x]=="O")
                        {
                            loose=true;
                        }
                    }
                }
                if(loose==false)
                {
                    if(theBoard[0][0]=="O" && theBoard[1][1]=="O" && theBoard[2][2]=="O")
                    {
                        loose=true;
                    }
                }
                if(loose==false)
                {
                    if(theBoard[2][0]=="O" && theBoard[1][1]=="O" && theBoard[0][2]=="O")
                    {
                        loose=true;
                    }
                }
                if(loose==false)
                {
                    full=true;
                    for(int y=0; y<3; y++)
                    {
                        for(int x=0; x<3; x++)
                        {
                            if(theBoard[y][x]==null)
                            {
                                full=false;
                            }
                        }
                    }
                }
            }
            if((win==true)||(full==true)||(loose==true))
            {
                end=true;
            }
        }
        
        System.out.println("   1  2  3");
        for(int y=0; y<3; y++)
        {
            System.out.print((y+1)+" ");
            for(int x=0; x<3; x++)
            {
                if(theBoard[y][x]==null)
                {
                    System.out.print("[ ]");
                    full=false;
                }
                else
                {
                    System.out.print("["+theBoard[y][x]+"]");
                }
            }
            System.out.println();
        }
        if(win==true)
        {
            System.out.println("You Win!");
        }
        else if(loose==true)
        {
            System.out.println("Better luck next time.");
        }
        else if(full==true)
        {
            System.out.println("Cat's game!");
        }
    }
}