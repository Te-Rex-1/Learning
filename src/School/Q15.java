package School;

import java.util.Scanner;

public class Q15 {
static boolean prime(int n){
    int c=0;
    for (int i = 1; i <=n ; i++) {
        if(n%i==0)
            c++;

    }
    return c == 2;
}

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter No");
        int n=in.nextInt();
        if ((n>9&&n<50)&&(n%2==0))
        {
            int tempSum=0;
            for (int i = 3; i <n ; i=i+2) {
                if (prime(n-i)){
                    tempSum=i+(n-i);
                    if (tempSum==n)
                        System.out.println("("+i+","+(n-i)+")");
                }
            }
        }
        else
            System.out.println("Invalid Input");
    }
}
