package LeetCode.Array;

public class InsertArray {
    public int searchInsert(int[] nums, int target) {
        int search=binarySearch(nums,target,0,nums.length-1,-1);
            if (search==-1)
        return search+1;
            else
                return search;

    }


    int binarySearch(int nums[],int target,int low,int high,int tracker)
    {

        if(low>high){
            return tracker;
        }
        else{
            int mid =(low+high)/2;
            if(nums[mid]==target){
                return mid;

            }
            else{
                if(nums[mid]>target)
                {
                    tracker=mid-1;
                    return binarySearch(nums,target,low,mid-1,tracker);
                }
                else{
                    tracker=mid+1 ;
                    return  binarySearch(nums,target,mid+1,high,tracker);
                }
            }
        }
    }

    public static void main(String[] args) {
        InsertArray ob=new InsertArray();
        int nums[]={1,3,5,6,7,8};
        System.out.println(ob.searchInsert(nums,9));
    }
}
