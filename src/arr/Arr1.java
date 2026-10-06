package arr;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Arr1 {

    public static void main(String[] args) {
        
        int i;

        int [] k=new int[3];

        k[0]=5;
        k[2]=10;
        k[1]=12;

        for(int f=0; f<k.length;f++){

            System.out.println(k[f]);
        }

        System.out.println(Arrays.toString(k));

        String s = Arrays.toString(k);

        JOptionPane.showMessageDialog(null, s);

    


    }


}
