package programmering_2;
import java.util.ArrayList;

import java.util.Arrays;

public class laxa_3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayList("hej", 3, 'c', 9)));
    }

    public static <T> T[] arrayList(T... t){
        return t;

    }
}
