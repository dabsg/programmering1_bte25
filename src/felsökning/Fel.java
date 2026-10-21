package felsökning;

public class Fel {

    public static void main(String[] args) {
        
    
        int pris = 100;
        int antal = 3;
        int rabatt = 10;

        int summa = pris * antal;
        double slutpris = summa * (  1-(rabatt/100.0) );

        System.out.println("Pris per vara: " + pris + " kr");
        System.out.println("Antal varor: " + antal);
        System.out.println("Summa före rabatt: " + summa + " kr");
        System.out.println("Slutpris: " + slutpris + " kr");

    }
}
