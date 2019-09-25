package programmering_2;

import java.util.ArrayList;
import java.util.Scanner;

public class lama_2 {
    public static void main(String[] args) {
        System.out.println("skriv ett ord");
        Scanner sc = new Scanner(System.in);
        String i = sc.next();
        String temp = "";



        for (int y = i.length() - 1; y >= 0; y--) {
            temp += i.charAt(y);
        }

        System.out.println(temp);
    }
}
