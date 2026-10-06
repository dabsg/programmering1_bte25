package arr;

import java.util.Arrays;
import java.util.Scanner;

public class Arr2 {

    public static void main(String[] args) {

        String [] ord=new String[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("ange ett ord till en mening");

        ord[0]=sc.nextLine();

        System.out.println("ange ett ord till en mening");

        ord[1]=sc.nextLine();

        System.out.println("ange ett ord till en mening");

        ord[2]=sc.nextLine();

        String mening ="hej "+ord[0]+" kan "+ord[1]+" inte "+ord[2];

        System.out.println(mening);
    }


}
