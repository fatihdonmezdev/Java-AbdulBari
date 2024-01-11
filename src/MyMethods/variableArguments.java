package MyMethods;


public class variableArguments {
    static void variables(int ...x){
        for(int a: x){
            System.out.println(a);

        }

    }
    public static void main(String[] args) {

    variables(11,12,13,14);
    }
}
