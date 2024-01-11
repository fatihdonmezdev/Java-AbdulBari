package MyMethods;

public class maxNumbersUsingVarargs {

    static int maxCalculator(int... A){
        int maxvalue = 0;
        if(A.length == 0 || A.length == 1){
            System.out.println("No or 1 argument(s) given!");
        }
        for(int i = 1; i < A.length; i++){
            if(A[i]>maxvalue){
                maxvalue = A[i];
            }
        }
        return maxvalue;
    }
    public static void main(String[] args) {
        int val = maxCalculator(1,2,333,422,66,89);
        System.out.println(val);
    }

    }
