package Ifsatser;

import javax.swing.JOptionPane;

public class Bank {
public static void main(String[] args) {
    
    double saldo=100000;    
    while(true){
        
        String vals=JOptionPane.showInputDialog("1. saldo\n 2. insättning\n 3.uttag ");
        int val=Integer.valueOf(vals);
        
        
        switch(val){

            case 1:
                JOptionPane.showMessageDialog(null, "saldo"+saldo);
                break;
            case 2:
            String in= JOptionPane.showInputDialog("insättning");
                break;
            case 3:
                String uttag=JOptionPane.showInputDialog("uttag");        
                break;
            default:
                System.exit(0);
                break;
        
        }
}


}
}
