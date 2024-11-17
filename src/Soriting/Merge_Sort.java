package Soriting;

public class Merge_Sort {

    void conquer(int arr[],int si,int mid,int ei){
    int merger[]=new int[ei-si+1];
    int indx1=si;// tracking array 1
    int indx2=mid+1;// tacking array 2
        int x=0;// for tacking merger array
        while(indx1<=mid&&indx2<=ei){
            if (arr[indx1]<=arr[indx2])
                merger[x++]=arr[indx1++];
            else {
                merger[x++]=arr[indx2++];
            }
        }
        while(indx1<=mid ){
            merger[x++]=arr[indx1++];
        }
        while(indx2<=ei){
            merger[x++]=arr[indx2++];
        }

        for (int i = 0,j=si; i < merger.length ; i++,j++) {
              arr[j]=merger[i];
        }
    }
    void divide(int arr[],int si,int ei){
        if (si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);


    }

    public static void main(String[] args) {
        Merge_Sort merge_sort=new Merge_Sort();
//        int n=10000;
//        int arr[]=new int[n];
//        for (int i = 0; i <n ; i++) {
//            arr[i]=(int)(Math.random()*9)+0;
//        }
        int arr[]={23,421,34,12,1,9,46};
        int n= arr.length;
        merge_sort.divide(arr,0,n-1);
        // printing
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }

}
