package GFG_Pracitce;

public class BInary_Search {
    int binarysearch(int arr[], int n, int k) {
        int left=0,right=n-1;
        int store=-1;
        while (left<right){
            int mid=(left + right)/2;
            if (arr[mid]==k)
            {
                store=mid;

            }
            else {

                if (arr[mid]>k)
                {
                    binarysearch(arr,mid+1,k);
                }
                else {
                    left=mid+1;
                    right=n;
                }
            }
        }

        return store;
    }

    public static void main(String[] args) {
        BInary_Search ob=new BInary_Search();
        int arr[] = {11 ,22 ,33 ,44 ,55};
        System.out.println(ob.binarysearch(arr,5,441));

    }
}
