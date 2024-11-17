package School;

import java.util.Scanner;
public class Cerver_Encryption {
    static String convert(char ch){
        String encrypted="";
        int ascii;
           ascii=(int)ch;
            if (ascii>=65&&ascii<=90)
            {
                if ((ascii+13)>90)
                {
                    encrypted+=(char)(64+((ascii+13)-90));
                }
                else {
                    encrypted+=(char)(ascii+13);
                }
            }
            else if(ascii>=97&&ascii<=122){
                if ((ascii+13)>122)
                {
                    encrypted+=(char)(96+((ascii+13)-122));

                }
                else {
                    encrypted+=(char)(ascii+13);
                }

        }
            else {
                encrypted+=ch;
            }
        return encrypted;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Sentence");
        String line=in.nextLine();
        String store="";
        for (int i = 0; i < line.length(); i++) {
            store+=convert(line.charAt(i));

        }
        System.out.println(store);


    }
}
