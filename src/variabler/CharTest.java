package variabler;

import javax.swing.JOptionPane;

public class CharTest {

    public static void main(String[] args) {
        
        char c ='r';
        char tecken ='\u1F68';

        int codePoint = 0x1F50A; // U+1F50A
        String speaker = new String(Character.toChars(codePoint));
        JOptionPane.showMessageDialog(null, speaker);



        System.out.println(c);
        System.out.println(tecken);
        JOptionPane.showMessageDialog(null, tecken);
        JOptionPane.showMessageDialog(null, tecken);


        



    }



}
