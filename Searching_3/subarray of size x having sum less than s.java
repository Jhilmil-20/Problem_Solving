public class Solution {
    public static void main(String[] args) {
        int[] A = {1, 3, 4, 2};
        int S = 7;
        System.out.println(maxSubarraySize(A, S)); // Output: 2
    }

    public static boolean isValid(int[] A, int S, int X) {
        int totalSum = 0;
        int count = 0;

        for (int num : A) {
            totalSum += num;
            if (totalSum > S) {
                count++;
                totalSum = num;
            }
        }
        count++;

        return count <= X;
    }

    public static int maxSubarraySize(int[] A, int S) {
        int low = 1;
        int high = A.length;
        int maxSize = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (isValid(A, S, mid)) {
                maxSize = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return maxSize;
    }
}
