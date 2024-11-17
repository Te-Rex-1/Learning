package Apnii_Kasha;

public class Recursion2 {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if(n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
//transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1, src, dest, helper);
//transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);
//transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1, helper, src, dest);
    }
    void tower(int n,String src,String helper,String dest){
        if (n==1)
        {
            System.out.println("Tranfer Disk "+n+"From "+src+"to "+helper);
        }
        
    }
    public static void main(String args[]) {

        int n =3;
        towerOfHanoi(n, "A", "B", "C");
    }
}
