package Recursion;

public class Fibonacci {
    // 0,1,1,2,3,5,8,13....n
    int fibonacciSeris(int n){
        if (n<=1)
        {
            return n;
        }
        else {

            return fibonacciSeris(n-1)+ fibonacciSeris(n-2);
        }
    }

    public static void main(String[] args) {
        Fibonacci ob=new Fibonacci();
        System.out.println(ob.fibonacciSeris(10));
    }
}
