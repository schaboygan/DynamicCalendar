import java.util.*;
import javax.swing.*;

public class Main {
    public String[][] cal = new String[5][7];

    public static void main(String[] args){
/*
        for(int i=1;i<30;i++){
            System.out.println(String.format("day %d:\n[%d][%d]",i,(i + 4) % 7,(7 - ((i + 4) % 7)) % 7));
        }*/
    }

    public int addEntry(int day, String entry){
        int row, col = 0;
        if(day<1 || day>29){ //for this month specifically
            System.out.println("day out of bounds");
            return -1;
        }

        else{
            if(day<=3) col=0; //this is bad, but it's rushed
            else if(day>3) col=1;
            else if(day<11) col=2;
            else if(day<18) col=3;
            else if(day<25) col=4;
            else col=5;

            row = day - col*4;
        }

        cal[col][row] = entry;
        return 0;
    }

    public void tooString(){
        //System.out.println("-----------------------------");
        for(int i=0; i<50;i++){
            if(i%6==0){
                //System.out.println("-----------------------------");
            }
        }
    }
}