package School;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter m and n");
        int m=in.nextInt();
        int n=in.nextInt();
        if ((m>0&&m<10)&&(n>2&&n<6)){
            int arr[][]=new int[m][n];
            for (int i = 0; i <m ; i++) {
                System.out.println("Enter Element of row :"+(i+1));
                for (int j = 0; j <n ; j++) {
                    arr[i][j]=in.nextInt();

                }
            }
            System.out.println("Filled Matrix");
            String temp="";
            for (int i = 0; i <m ; i++) {

                for (int j = 0; j <n ; j++) {
                    temp+=Integer.toString(arr[i][j]);


                }
                System.out.print(temp +"\t"+Integer.parseInt(temp,8));
                System.out.println();
            }

        }

    }
}
