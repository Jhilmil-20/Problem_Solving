import java.util.Arrays;

class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0;

            for (int num : nums) {
                count += (num - 1) / mid;
            }

            if (count > maxOperations) {
                low = mid + 1;
            } else {
                result = mid;
                high = mid - 1;
            }
        }

        return result;
    }
}
