package variabler;

import java.util.Scanner;

public class StringTest1 {
public static void main(String[] args) {
    


    String namn= "Eva Göransson";

    char förnamnInitsial=namn.charAt(0);
   
    int position=namn.indexOf(' ');

    char efternamnInitsial=namn.charAt(position+1);

    System.out.println(position);
    System.out.println(efternamnInitsial);

    System.out.println(förnamnInitsial);


  
}

}
