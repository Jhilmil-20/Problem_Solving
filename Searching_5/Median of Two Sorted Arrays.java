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

//optimised 

