package programmering_2;

public class laxa_1 {

    public static void main (String[] args){

        //int [] arr = {10,5,3,2};
        //printArray(arr);
        System.out.println("hej");
        String a = "hej";
        ord(a);
    }

    /*public static void printArray(int[] array){
        int sum = 0;
        for(int i = 0; i<array.length; i++){

            sum = sum + array[i];


        }
        System.out.println(sum);
    }
*/
    public static void ord(String a){
        String x ="";

        for(int i = a.length() - 1; i >= 0; i--){

            x += a.charAt(i);

        }
        System.out.println(x);
    }




}
