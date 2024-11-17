package School;

import java.util.Scanner;

public class UniqueNO {
    // method for checking no is unique or not
   static boolean check(int n){
        boolean flag=false;
        String no=Integer.toString(n);

        for (int i = 0; i <no.length()-1; i++) {
            for (int j = i+1; j <no.length(); j++) {
                if (no.charAt(i)==no.charAt(j))
                {
                    flag=true;
                    break;
                }
            }
        }
        return flag;

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Value of m and n");
        int m=in.nextInt();
        int n=in.nextInt();
        if (m<n){
            int k=0;
            for (int i = m; i <n ; i++) {
                if (!check(i)){
                    k++;
                    System.out.print(i+",");
                }
            }
            System.out.println();
            if (k==0)
            {
                System.out.println("No unique no present");
            }
            else {
                System.out.println("Frequency of Unique no is "+k);
            }
        }
        else {
            System.out.println("N>M");
        }
    }

}
