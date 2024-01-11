import java.util.Scanner;

public class Main {

    static boolean isPrime(int x){
                for(int i=2; i <= x/2 ; i++){
                    if(x % i == 0){
                        return false;
                    }
        }
        return true;

    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number;");

        int sayi = input.nextInt();
        boolean result = isPrime(sayi);
        if(result){
            System.out.println("This number IS a prime number!");
        }else{
            System.out.println("This number is NOT a prime number");
        }


    }
}