package Ifsatser;

import javax.swing.JOptionPane;

public class Joptionpanetest {

    public static void main(String[] args) {
        


        String s = JOptionPane.showInputDialog("ange ett tal");

        JOptionPane.showMessageDialog(null, "du valde boll");

        int svar=JOptionPane.showConfirmDialog(null, "sdfsdfsd");

        if(svar ==0 ){

            System.out.println("du valde ja ");
        }

        System.out.println(svar);
    }


}
