package Soriting;

public class Quick_Sort {
    static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pivot=partition(arr,low,high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);

        }

    }
    static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int j=low -1;
        for (int i = low; i <high ; i++) {
            if (arr[i]<pivot){
                j++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        return j;

    }

}
