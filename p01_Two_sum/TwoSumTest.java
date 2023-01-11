package p01_Two_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {
    private int[] nums;
    private int target;
    private int[] expected;


    @Test
    void example1()
    {
        nums = new int[]{2, 7, 11, 15};
        target = 9;

        expected = new int[]{0, 1};
        Assertions.assertArrayEquals(expected, TwoSum.twoSum(nums, target));
    }

    @Test
    void example2()
    {
        nums = new int[]{3, 4, 2};
        target = 6;

        expected = new int[]{1, 2};
        Assertions.assertArrayEquals(expected, TwoSum.twoSum(nums, target));
    }

    @Test
    void example3()
    {
        nums = new int[]{3, 3};
        target = 6;

        expected = new int[]{0, 1};
        Assertions.assertArrayEquals(expected, TwoSum.twoSum(nums, target));
    }
}
