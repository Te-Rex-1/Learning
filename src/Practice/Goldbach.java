package Practice;

import java.util.Scanner;

public class Goldbach {
   static boolean prime(int n){
        int count=0;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
                count++;
        }
        if (count==2)
            return true;
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter No");
        int no=in.nextInt();
        if (no%2==0)
        {
            if (no>9){
                for (int i=3;i<no;i=i+2)
                {  if (prime(i)) {
                    for (int j = 3; j < no; j = j + 2) {
                        if (prime(j)) {
                            if ((i+j)==no)
                                System.out.println("prime pair "+i+","+j);
                        }
                    }
                }}
            }
            else {
                System.out.println("Invalid Input" );
                System.exit(0);
            }
        }
        else {
            System.out.println("Odd No");
        }

    }
}
