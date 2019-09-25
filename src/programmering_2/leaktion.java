package programmering_2;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class leaktion {

    public static void main(String[] args){
        //int[] intarr = {5,4,3,2,5,};
       //int tal = summera(intarr);
        //System.out.println(tal);

        String ord = "niklas";
        ArrayList<String> bokstaver = new ArrayList<String>();
       String ordbaklanges = rekursivMetod(ord,ord.length()-1,bokstaver);
       System.out.println(ordbaklanges);

    }

    public static int summera( int[] talen)
    {
        int summa = 0;
    for(int tal:talen){
        summa += tal;
    }
    return summa;
    /*
     int summa = 0;
        for(int i = 0; i < talen.length; i++){
            summa += talen[i];
        }


        return summa;

     */
    }

    public static String rekursivMetod(String ord, int index, ArrayList<String> bokstaver)
    {
        String resultat = "";
        String bokstav = ord.charAt(index) + "";
        bokstaver.add(bokstav);

        if(index != 0){
        rekursivMetod(ord, --index, bokstaver);
    }
        return resultat;
    }




}
