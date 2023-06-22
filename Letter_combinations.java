class Solution {
    public List<String> letterCombinations(String digits) {
        
        
        Queue<String> q = new LinkedList<>();

        if(digits==null || digits.length()==0)
        return new ArrayList<>(q);

        int len = digits.length();

        int[] arr = new int[len];

        for(int i=0; i<len; i++)
        {
            arr[i] = digits.charAt(i)-'0';
        }
        String letters[] = {"0","1","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        q.offer("");

        for(int i=0; i<len; i++)
        {
            String words = letters[arr[i]];
            int size = q.size();

            for(int j=0; j<size; j++)
            {
                String temp = q.poll();

                for(char c: words.toCharArray())
                q.offer(temp + c);
            }
        }
        return new ArrayList<>(q);


    }
}
