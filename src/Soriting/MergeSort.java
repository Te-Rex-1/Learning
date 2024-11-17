package Soriting;

public class MergeSort {
    void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];

    }
  void divide(int arr[],int si,int ei){
      if(si>=ei){
          return;
      }
      int mid=si+(ei-si)/2;
      divide(arr,si,mid);
      divide(arr,mid+1,ei);


  }

    public static void main(String[] args) {
        MergeSort mergeSort=new MergeSort();
        int n=100;
        int arr[]=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=(int )(Math.random()*9)+0;
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
        mergeSort.divide(arr,0,n-1);
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
