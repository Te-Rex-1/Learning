import java.util.Scanner;

public class FACT {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=0;
         double fact=1;
        System.out.println("Enter no " );
        while(n!=-1){

            n=in.nextInt();
        for (int i = 1; i <=n; i++) {
            fact=((2*i)/((Math.pow(2,i))*i));

        }
        System.out.println("Answer is :"+fact);}


    }
}
