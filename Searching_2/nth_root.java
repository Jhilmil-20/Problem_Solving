class Solution
{
    public int NthRoot(int n, int m)
    {
        if (m == 0 || m == 1) {
            return m;
        }

        int low = 0;
        int high =(int) Math.pow(10,9);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long compare = (long) Math.pow(mid,n);

            if (compare == m) {
                return mid;
            } else if (compare < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
