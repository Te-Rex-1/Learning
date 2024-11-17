package LeetCode.Array;

public class DuplicateArr {
    // searching fine
    public int removeDuplicates(int[] nums) {
        int k=0;// for counting no of elements
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i; j <nums.length ; j++) {
                if (j==i)
                {
                    continue;
                }
                else {
                    if (nums[i]==nums[j])//  1==1
                    {
                        nums[j]=-1;
                        k++;
                    }
                }
            }
        }
        swap(nums);
        return k;

    }

        void swap(int nums[]){
        int start=-1;
        int last=-1;

            for (int i =1 ; i < nums.length ; i++) {
                if (nums[i]==-1){
                   start=i;

                    for (int j = start+1; j <nums.length ; j++) {
                        if (nums[j]!=-1)
                        {
                            last=j;
                            nums[start]=nums[last];
                            nums[last]=-1;
                            break;
                        }
                    }
                }



            }
        }

    public static void main (String[]args){
        DuplicateArr ob = new DuplicateArr();
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
//        int n=100000;
//        int[] nums =new int[n];
//        for (int i = 0; i <n ; i++) {
//            nums[i]=(int)(Math.random()*9)+1;
//        }for (int i = 0; i <n ; i++) {
//            System.out.print(nums[i]);
//        }
        System.out.println(ob.removeDuplicates(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+",");

        }

        }
    }


