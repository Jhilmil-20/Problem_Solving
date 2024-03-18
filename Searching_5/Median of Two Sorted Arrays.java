//Bruteforce, create an array find median...

import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int i;
        int[] l3= new int[l1+l2];
        System.arraycopy(nums1,0,l3,0,l1);
        System.arraycopy(nums2,0,l3,l1,l2);
        Arrays.sort(l3);
        if((l1+l2)%2!=0){
            return (double)(l3[(l1+l2)/2]);
        }
        else{
           return (double)(l3[(l1+l2+1)/2]+l3[(l1+l2-1)/2])/2;
        
        }
    }
}

//optimised , using binary search 
//The solution is not fully correct , but I tried. 
class Solution {
    public int count(int[] arr, int n, int key) {
        int left = 0, right = n;

        int mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                while (mid + 1 < n && arr[mid + 1] == key)
                    mid++;
            } else if (arr[mid] > key)
                right = mid;
            else
                left = mid + 1;
        }
        while (mid > -1 && arr[mid] > key)
            mid--;
        return mid + 1;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int low = Math.min(nums1[0], nums2[0]);
        int high = Math.max(nums1[n - 1], nums2[m - 1]);
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int countlessthanmid = count(nums1, n, mid) + count(nums2, m, mid);

            if (countlessthanmid < (n + m + 1) / 2) {
                low = mid + 1;
            } else if (countlessthanmid > (n + m + 1) / 2){
                high = mid - 1;
            }
            else{
                ans = mid;
                low =mid+1;
            }
        }

        if ((n + m) % 2 == 0) {
            int next = low;
            while (count(nums1, n, next) + count(nums2, m, next) == (n + m) / 2) {
                next++;
            }
            ans = (ans + next) / 2;
        }
        return ans;
    }
}

