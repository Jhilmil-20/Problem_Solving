import java.util.ArrayList;
import java.util.List;

class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        List<Integer> costs = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            costs.add(Math.abs(s.charAt(i) - t.charAt(i)));
        }
        
        int maxLength = 0;
        int currentCost = 0;
        int start = 0;
        
        for (int end = 0; end < s.length(); end++) {
            currentCost += costs.get(end);
            
            while (currentCost > maxCost) {
                currentCost -= costs.get(start);
                start++;
            }
            
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }
}

