public class Fibonacci {
    public static void main(String args[]){

        int n = 10;

        System.out.println( "The " + n + " term in the fibonacci sequence is " +
                fibonacciOf(n)+ ".");


    }

    public static int fibonacciOf(int n){

        if (n < 2) {
            return n;
        }
        else {
            return fibonacciOf(n-1) + fibonacciOf(n-2);
        }

    }

}
