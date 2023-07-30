import java.util.Arrays;
public class MaximumGap164 {
    class Solution {
        public int maximumGap(int[] nums) {
            if (nums.length == 0){
                return 0;
            }
            int maxGap =0;
            Arrays.sort(nums);
            for(int i =0; i<nums.length-1;i++){
                int temp = nums[i+1] - nums[i];
                maxGap = Math.max(temp,maxGap);
            }

            return maxGap;
        }
    }
}
