package School;


import java.util.Scanner;
import java.util.StringTokenizer;

public class Vowel {
   public int count=0;
    String check(String line){
        if(line.endsWith(".")||line.endsWith("?")||line.endsWith("!"))
        {       String vowel="";
            String nonVowel="";
            line=line.toUpperCase();

            StringTokenizer stringTokenizer=new
                    StringTokenizer(line);
            while (stringTokenizer.hasMoreTokens()){
                String temp=stringTokenizer.nextToken();
                if ((temp.startsWith("A")||temp.startsWith("E")||temp.startsWith("I")||temp.startsWith("O")||temp.startsWith("U"))&&(temp.endsWith("A")
                        ||temp.endsWith("E")||temp.endsWith("I")||temp.endsWith("U")||temp.endsWith("O"))){
                    vowel+=temp+" ";
                    count++;
                }
                else {
                    nonVowel+=temp+" ";
                }
            }
           return  (vowel+nonVowel);
        }
        else {
            return "Invalid input";
        }

    }

    public static void main(String[] args) {
        frame_vowel ob=new frame_vowel();


    }
}
