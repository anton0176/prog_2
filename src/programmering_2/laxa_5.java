package programmering_2;
import java.util.ArrayList;
import java.util.Scanner;

public class laxa_5 {

    public static void main(String[] args) {
        int z = 1;
        int y = 0;

        System.out.println("skriv ett ord");
        Scanner sc = new Scanner(System.in);
        String i = sc.next();


        for(int x = i.length(); x > 0; x--) {

            z = z * x;
        }
        System.out.println(z);
    }

}
