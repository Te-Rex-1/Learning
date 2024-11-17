package School;

public class KeithNO {
    static void check(int n){
     String tempStore=Integer.toString(n);
     int arr[]=new int[tempStore.length()];
     boolean flag;
     int sum=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Character.getNumericValue(tempStore.charAt(i));
            sum+=arr[i];
        }
        out: for (int i = 0; i <n ; i++) {
            if (sum==n){
                flag=true;
            break out;}
            else {
                sum+=sum-arr[i];
                arr[i]=(sum+arr[i])/2;
                System.out.println(sum+",");
            }

        }

     
    }

    public static void main(String[] args) {
       check(742);
    }

}
