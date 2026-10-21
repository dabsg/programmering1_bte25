package operatorer;

public class Kassa {

    public static void main(String[] args) {
        
        int varor=212;

        int kontant=1000;

        int växel = kontant-varor;

        int femhundra= växel/500;
        int rest     = växel%500;
        int tvåhundra=  rest/200;
            rest     = rest%200;


        System.out.println("antal femhundralappar:" +femhundra);



    }





}
