package Apnii_Kasha;

public class Recursion {
    int Sum=0;
    // q1
    void print(int n)
    {
        if (n==5)
            return;
        System.out.println(n);
        print(n+1);
    }
    // q1 sum from 1 to 5
    void sum(int n,int Sum)
    {
        if(n == 0) {
            System.out.println(Sum);
            return;
        }
        Sum+=n;
        sum(n-1,Sum);

    }
    // q3
    int fact(int n)
    {
        if (n>=1)
            return n*fact(n-1);
        else
            return 1;
    }

    public static void main(String[] args) {
        Recursion Q3=new Recursion();
       // Q1.print(10);
//        Q2.sum(5,0);
        System.out.println(Q3.fact(5));
    }
}
