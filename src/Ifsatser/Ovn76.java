package Ifsatser;

import javax.swing.JOptionPane;

public class Ovn76 {
public static void main(String[] args) {
    
    double skiva =9.90;
    double rabbat=0;
    String antalString=JOptionPane.showInputDialog("ange antal skivor");

    int antal = Integer.valueOf(antalString);
    
    // >10 5%
    // >50 10%
    // >100 15%

    if(antal >10 && antal<=50){

        rabbat=0.95;

    }else if(antal>50){

        rabbat=0.9;

        }else if(antal>100){

            rabbat=0.85;
        }
    
    double totalpris = (skiva * antal ) * rabbat ;
    System.out.println("summan blir "+totalpris+" din rabbat blir i procent"+(100-(rabbat*100)));


}
}
