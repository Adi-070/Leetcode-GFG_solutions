class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> countMap = new HashMap<>();
        
        // Count occurrences of each string
        for (String s : arr) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }
        
        // Collect distinct strings
        int distinctCount = 0;
        for (String s : arr) {
            if (countMap.get(s) == 1) {
                distinctCount++;
                if (distinctCount == k) {
                    return s;
                }
            }
        }
        
        // Return empty string if k-th distinct does not exist
        return "";
    }
}
