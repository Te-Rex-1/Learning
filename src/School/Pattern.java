package School;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int size=in.nextInt();
        char arr[][]=new char[size][size];
        char char1=in.next().charAt(0);
        char char2=in.next().charAt(0);
        // logic
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j < size; j++) {
                if (i==j)
                {
                    arr[i][j]=char1;
                }
                else if (j==(size-i+1))
                {
                    arr[i][j]=char1;
                }
                else if (i<(size/2)){
                    for (int k = j+1; k <size-j+1 ; k++) {
                        arr[i][j]=char2;
                    }
                }

            }

        }
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
