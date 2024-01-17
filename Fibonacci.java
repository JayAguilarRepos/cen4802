public class Fibonacci {
    public static void main(String args[]){

        int n = 10;

        System.out.println( "The " + n + " term in the fibonacci sequence is " +
                fibonacciOf(n)+ ".");


    }

    /**
     * This funciton outputs the fibonacci sequence that corresponds with the int parameter.
     * @param n Indicates the sequence number of fibonacci
     * @return returns the fibonacci number corresponding to the input.
     */
    public static int fibonacciOf(int n){

        if (n < 2) {
            return n;
        }
        else {
            return fibonacciOf(n-1) + fibonacciOf(n-2);
        }

    }

}
