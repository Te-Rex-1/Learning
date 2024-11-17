package GFG_Pracitce.Recursion;

public class Shuffle_Array {
    static void shuffleArray(long arr[], int n)
    {
        // Your code goes here
        int x=0;
        int y=n/2;
        int i=0;
        while(i<(n/2)){
            System.out.print(arr[x++]+" "+arr[y++]+" ");
            i++;
        }
    }

   static void fibonaaci(int n){

        for (int j = 1; j <n ; j++) {
            System.out.println((Math.pow(1.618,j)-Math.pow(-0.618,j))/(1.618+0.618));        }

    }

    public static void main(String[] args) {
        long arr[]={1,2,9,15};
        shuffleArray(arr,4);

    }
}
