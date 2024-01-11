package MyMethods;

import java.util.Scanner;

public class GreatestCommonDivider {
    static int GCDCalculator(int x, int y){
       int greatestCommonDivider = 0;
       for(int i = 2; i < x/2|| i < y/2; i++ ){
           if(x % i == 0 && y % i == 0){
               greatestCommonDivider = i;
           }

       }
        return greatestCommonDivider;

    };
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers;");

        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        int result = GCDCalculator(sayi1,sayi2);
        System.out.println(result);
    }
}
