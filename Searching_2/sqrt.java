class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int low = 0;
        int high = Math.min(x,1000000000);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long)mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high;
    }
}
