package round2;

import java.util.Arrays;

/**
 * Created on 2018-01-29
 *
 * @author Jerry Shen
 */
public class P628 {

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int res1 = nums[len-1] * nums[len-2] * nums[len-3];
        int res2 = nums[0] * nums[1] * nums[len-1];
        return Math.max(res1, res2);
    }
}
