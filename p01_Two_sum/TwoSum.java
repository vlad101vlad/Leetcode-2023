package p01_Two_sum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    static public int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> table = new HashMap<>();
        for(int i  = 0; i < nums.length; i++){
            int currentNum = nums[i];
            int toTarget = target - currentNum;

            if(table.containsKey(toTarget)){
                return new int[]{table.get(toTarget), i};
            }
            table.put(currentNum, i);
        }
        return new int[2];
    }
}
