package Ifsatser;

import javax.swing.JOptionPane;

public class Löpning {
public static void main(String[] args) {
    

    int [] tider=new int[3];

    String s =JOptionPane.showInputDialog(tider);

    tider[0]= Integer.valueOf(s);

    
    s =JOptionPane.showInputDialog(tider);

    tider[1]= Integer.valueOf(s);

    
     s =JOptionPane.showInputDialog(tider);

    tider[2]= Integer.valueOf(s);


    int fastetTime=1000000000;

    if(tider[0]<fastetTime){

        fastetTime=tider[0];

    }

    if(tider[1]<fastetTime){

        fastetTime=tider[1];
    }
    if(tider[2]<fastetTime){

        fastetTime=tider[2];
    }

    System.out.println(fastetTime);


}
}
