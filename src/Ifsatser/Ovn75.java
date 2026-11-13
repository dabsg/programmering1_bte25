package Ifsatser;

import javax.swing.JOptionPane;

public class Ovn75 {


public static void main(String[] args) {
    
 
    //läs in hopp längd

    String längsString=JOptionPane.showInputDialog("ange hopp längd");

    double längd=Double.valueOf(längsString);

    // läs in vind styrka

    String vindString=JOptionPane.showInputDialog("ange vind styrka");

    double vind=Double.valueOf(vindString);


    // testa om längre än 7.92 och vind mindre än 2.0

    if(längd > 7.92  &&  vind < 2.0 ){

        System.out.println("grattis nytt klubbrekort");

    }else{
        System.out.println("fel längd eller fel vind styrka");

    }

}
}
