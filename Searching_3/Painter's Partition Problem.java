import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k) {
        int low = Collections.max(boards);
        int high = boards.stream().mapToInt(Integer::intValue).sum();

        while (low <= high) {
            int mid = (low + high) / 2;
            int student = countStudent(boards, mid);

            if (student > k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }

    private static int countStudent(ArrayList<Integer> arr, int pages) {
        int student = 1;
        long pageStudent = 0;

        for (int pagesInBook : arr) {
            if (pageStudent + pagesInBook <= pages) {
                pageStudent += pagesInBook;
            } else {
                student++;
                pageStudent = pagesInBook;
            }
        }
        return student;
    }
}
