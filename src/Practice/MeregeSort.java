package Practice;

public class MeregeSort {
    void conquer(int arr[], int si,int mid, int ei){
        int merger[]=new int[ei-si+1];
        int indx1=si;
        int indx2=mid+1;
        int m=0;
        while (indx1<=mid&&indx2<=ei){
            if (arr[indx1]>=arr[indx2])
            {
                merger[m++]=arr[indx2++];
            }
            else {
                merger[m++]=arr[indx1++];
            }
        }
        while(indx1<=mid){
            merger[m++]=arr[indx1++];
        }
        while (indx2<=ei)
        {
            merger[m++]=arr[indx2++];
        }
        // copying element merger sort in arr array
        for (int i = 0,j=si; i <merger.length ; i++ ,j++) {
            arr[j]=merger[i];
        }
    }
   void divide(int arr[],int si, int ei){
       if (si>=ei)
       {
           return;
       }
       int mid=si+(ei-si)/2;
       divide(arr,si,mid);
       divide(arr,mid+1,ei);
       conquer(arr,si,mid,ei);
   }

    public static void main(String[] args) {
        MeregeSort meregeSort= new MeregeSort();
        int arr[]={23,421,34,12,1,9,46};
        meregeSort.divide(arr,0,arr.length-1);
        // printing
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
