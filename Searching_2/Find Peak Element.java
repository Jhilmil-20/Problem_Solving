public int findPeakElement(int[] nums) {
    int length = nums.length;
    int start = 0;
    int end = length - 1;
    int mid = 0;
    while (start <= end) {
        mid = start + (end - start) / 2;  
        if (mid + 1 > length - 1 || nums[mid] > nums[mid + 1]) {
            if (mid - 1 < 0 || nums[mid] > nums[mid - 1]) {
                return mid;
            } else {
                end = mid - 1;
            }
        } else if (mid - 1 < 0 || nums[mid] > nums[mid - 1]) {
            start = mid + 1;
        } else {
            if (nums[mid - 1] > nums[mid + 1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
    return mid;    
}
