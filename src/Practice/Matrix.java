package Practice;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Row and column");
        int row=in.nextInt();
        int column=in.nextInt();
        int temp,sum=0;
        int arr[][]=new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j]=(int)(Math.random()*9)+0;
            }
        }
        // printing orignal matrix
        System.out.println("Printing Original matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        // interchanging diagonal element
        System.out.println("Interchanging Diagonal Element");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i==j)
                {
                    temp=arr[i][j];
                    arr[i][j]=arr[i][column-i-1];
                   // System.out.println(arr[i][j]);
                    arr[i][column-i-1]=temp;
                    //System.out.println(arr[][]);
                }

            }

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // sum of boundary element
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <column; j++) {
                if (i==0||j==0||i==row-1||j==column-1)
                {
                    System.out.print(arr[i][j]+" ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
      //  System.out.println("Sum of boundary element "+(sum-arr[0][0]+arr[row-1][column-1]+arr[0][column-1]+arr[row-1][0]));
    }
}
