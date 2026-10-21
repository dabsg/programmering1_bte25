package arr;

public class Swap {
public static void main(String[] args) {
    
    int [] i= new int[3];

    i[0]=1;
    i[1]=2;
    i[2]=3;
    
    System.out.println(i[0]+" "+i[1]+" "+i[2]);

    int temp = i[0];
    i[0]=i[2];
    i[2]=temp;

    System.out.println(i[0]+" "+i[1]+" "+i[2]);


}
}
