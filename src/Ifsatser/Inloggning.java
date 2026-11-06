package Ifsatser;

import javax.swing.JOptionPane;

public class Inloggning {

    public static void main(String[] args) {
        
        String userids=JOptionPane.showInputDialog("ange user id");

        int userid=Integer.valueOf(userids);

        String passwords=JOptionPane.showInputDialog("ange lösenord");



        if(userid==34){
            if(passwords.equals("Hej")){
           
            System.out.println("du är inloggad");
            }else{
                System.out.println("fel lösenord");
            }
        }else{

            System.out.println("fel id");
            if(!passwords.equals("Hej")){
                System.out.println("fel lösenord");
            }
        }


    }



}
