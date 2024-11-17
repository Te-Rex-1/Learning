package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintBackward {
    void printBackward() throws IOException {
        char ch;
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        ch=(char)System.in.read();
        if (ch!='.'){
            printBackward();
            System.out.print(ch);
        }

    }

    public static void main(String[] args) throws IOException {
        PrintBackward ob=new PrintBackward();
        ob.printBackward();
    }

}
