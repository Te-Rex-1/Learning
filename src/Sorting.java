public class Sorting {
    // Bubble  sort
    void BubbleSort(int arr[]){
        int k=0;
        //  for optimised using boolean
        boolean swap=false;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <arr.length-1 ; j++) {
                System.out.println("No step performing"+ ++k);
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if (!swap)
                break;
        }
    }
    // insertion sort
    void InsertionSort(int arr[]){
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > current) {
                //Keep swapping
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

    }
    void insertion(int arr[]){
        for (int i = 1; i < arr.length ; i++) {
            int current=arr[i];
            int j=i-1;
            while (j>=0&&current<arr[j]){
                // placement
                arr[j+1]=arr[j];
               j--;
            }
            arr[j+1]=current;

        }
    }
    void PrintArray(int arr[])
    {
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
    // selection sort
    void selectionSort(int arr[]){


        for (int i = 0; i <arr.length-1 ; i++) {
            int smallest=i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[smallest]>arr[j]){
                    smallest=j;
                }

            }
            // swap
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;

        }
    }

    public static void main(String[] args) {
        Sorting bubbleSort=new Sorting();
//        Sorting insertionSort=new Sorting();
        Sorting selectionSort=new Sorting();
        // generating array
        int n=5;

        int arr[]={1,2,3,4,5};

//        for (int i = 0; i <n ; i++) {
//            arr[i]=(int)(Math.random()*9)+0;
//        }
        System.out.println("Unsorted Array");
        bubbleSort.PrintArray(arr);
        bubbleSort.BubbleSort(arr);
        System.out.println("Sorted Array");
        bubbleSort.PrintArray(arr);
//
//        // leave here
//        System.out.println("Unsorted Array");
////        insertionSort.PrintArray(arr);
//        selectionSort.PrintArray(arr);
////        insertionSort.insertion(arr);
//        selectionSort.selectionSort(arr);
//       // insertionSort.InsertionSort(arr);
//        System.out.println("Sorted Array");
////        insertionSort.PrintArray(arr);
//        selectionSort.PrintArray(arr);

    }
}
