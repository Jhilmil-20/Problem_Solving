class Solution {
    boolean isPossible(int[] stalls,int n ,int mid)
    {
        int lastplaced=stalls[0];
        int totalplaced=1;
        for(int i=0;i<=n;i++)
        {
            if(stall[i]-lastplaced>=mid)
            {
                totalplaced++;
                lastplaced=stalls[i];
            }
            
        }
    }
    public static int solve(int n, int k, int[] stalls) {
        int low=1;
        int ans;
        int high=stalls[n-1]-stalls[0];
        while(low<=high)
        {
            int mid=(low+high)/2;
            if isPossible(int[] stalls, int n, int mid)
            {
               ans=mid;
               low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return ans;
    }
}
