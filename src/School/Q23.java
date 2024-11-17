package School;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter String 1");
        String s1=in.next();
        System.out.println("Enter String 2");
        String s2=in.next();
        System.out.println("Enter String 3");
        String s3=in.next();
        boolean p=true;
        boolean q=true;
        int t1=0;
        int t2=0;

            for (int i = 0; i <s3.length(); i++) {
                String temp=String.valueOf(s3.charAt(i));
                if (t1!=s1.length()){
                if (String.valueOf(s3.charAt(i)).equals(String.valueOf(s1.charAt(t1)))){
                    t1++;

                }}
                if(t2!=s2.length()){
                 if (String.valueOf(s3.charAt(i)).equals(String.valueOf(s2.charAt(t2))))
                {
                    t2++;
                }}
                else {
                    p=false;
                    q=false;
                }
            }

        if (p&&q)
        {
            System.out.println("String is valid");
        }
        else {
            System.out.println("String is not valid");
        }
    }
}
