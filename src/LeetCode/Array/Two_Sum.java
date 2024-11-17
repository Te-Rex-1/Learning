package LeetCode.Array;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int store[] = new int[2];
       boolean found = false;

        for (int i = 0; i < nums.length ; i++) {
            if (found==false) {
                for (int j = 0; j < nums.length ; j++) {
                    if(j==i)
                    {
                        continue;
                    }
                    else {
                    if ((nums[i] + nums[j]) == target) {
                        store[0] = i;
                        store[1] = j;
                       found=true;
                        break;
                    }}
                }
            }
        }
        return store;
    }

    public static void main(String[] args) {
        Two_Sum ob=new Two_Sum();
        int n=100000;
        int[] nums =new int[n];
        for (int i = 0; i <n ; i++) {
            nums[i]=(int)(Math.random()*9)+1;
        }for (int i = 0; i <n ; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
        int store[]=new int[2];
        store=ob.twoSum(nums,9);
        System.out.println(store[0]+","+store[1]);

    }
}