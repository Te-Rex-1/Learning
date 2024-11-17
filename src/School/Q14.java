package School;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q14 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter paragraph with two sentence");
        String sen=in.nextLine();
        StringTokenizer stringTokenizer=new StringTokenizer(sen,".!?");
        if (stringTokenizer.countTokens()==2)
        {   int count=0;
            String temp1=stringTokenizer.nextToken(".!?");
            String temp2=stringTokenizer.nextToken(".!?");
           StringTokenizer stringTokenizer1=new StringTokenizer(temp1);
           StringTokenizer stringTokenizer2=new StringTokenizer(temp1);
           String arr1[]=new String[stringTokenizer1.countTokens()];
           String arr2[]=new String[stringTokenizer1.countTokens()];
            System.out.println(temp1+"\n"+temp2);
            for (int i = 0; i <(stringTokenizer1.countTokens()+stringTokenizer2.countTokens()) ; i++) {
                for (int j = 0; j <(stringTokenizer1.countTokens()+stringTokenizer2.countTokens()) ; j++) {
                    if (arr1[i].equals(arr2[j])){
                        count++;

                    }
                }
                if (count!=0){
                    System.out.print(arr1[i]+"\t"+count);
                    count=0;
                }
            }
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
