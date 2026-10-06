package typovndling;

import javax.swing.JOptionPane;

public class Stringtoint {

    public static void main(String[] args) {
        
        String tal=JOptionPane.showInputDialog("ange ett tal");

        double riktigtTal=Double.parseDouble(tal);

        double svar=riktigtTal*riktigtTal;

        JOptionPane.showMessageDialog(null, svar);
    }



}
