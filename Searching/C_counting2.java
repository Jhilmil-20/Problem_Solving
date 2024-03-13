//using sorted array, sort array using Arrays.sort.

public static int solution(int[] arr, int target){
    int low = 0;
    int high = arr.length - 1;
    while(low <= high){
        int mid = low + (high - low) / 2;
        if(arr[mid] >= target){
            high = mid - 1;
        } else{
            low = mid + 1;
        }
    }
    return arr.length - high - 1;
}
