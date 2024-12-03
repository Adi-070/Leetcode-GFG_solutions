

class Solution {
    public String countAndSay(int n) {
        String s = "1";

        for (int i = 1; i < n; i++) {
            List<int[]> list = RLE(s);
            s = integer(list);
        }
        return s;
    }

    public List<int[]> RLE(String s) {
        List<int[]> list = new ArrayList<>();
        char currentChar = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                count++;
            } else {
                list.add(new int[]{currentChar - '0', count});
                currentChar = s.charAt(i);
                count = 1;
            }
        }
        list.add(new int[]{currentChar - '0', count}); // Add last character group

        return list;
    }

    public String integer(List<int[]> pairs) {
        StringBuilder sb = new StringBuilder();

        for (int[] pair : pairs) {
            sb.append(pair[1]).append(pair[0]);
        }
        return sb.toString();
    }
}
