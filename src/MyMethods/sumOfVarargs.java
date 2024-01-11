package MyMethods;

public class sumOfVarargs {
    static int sum(int... A){
        int sum = 0;
        if(A.length == 0 || A.length == 1){
            System.out.println("No or 1 argument(s) given!");
        }
        for(int i = 1; i < A.length; i++){
            sum += A[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int val = sum(1,2,333,422,66,89);
        System.out.println(val);
    }
}
