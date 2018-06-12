package array;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

    public void twoSumMethod(int[] nums, int target){
        List<Integer> data = new ArrayList<>();
        int complement = 0;
        for(int i=0; i<nums.length; i++) {
            complement = target - nums[i];
            if (data.contains(complement)) {
                System.out.println(data.indexOf(complement) + "," +i);
            }
            data.add(nums[i]);
        }
    }

    public static void main(String[] args){
        TwoSum twoSum = new TwoSum();

        int[] nums = {2,7,11,15};

       twoSum.twoSumMethod(nums, 9);
    }
}
