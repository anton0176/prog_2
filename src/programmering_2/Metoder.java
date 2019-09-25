public class Metoder {

    public static void main(String[] args){
        metod1();
    System.out.println("main");


    int sum = doubleMe(7);
    System.out.println("Sum är " + sum);

    double sum2 = doubleMe(2.5);
    System.out.println("sum är " + sum2);
    }


    public static void metod1(){
        System.out.println("Metod 1");

    }


    public static int doubleMe( int number){


        return number * 2;
    }
    public static double doubleMe(double number){
        return number * 2;
    }


}

