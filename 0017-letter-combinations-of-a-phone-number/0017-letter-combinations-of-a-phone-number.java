class Solution {
    public List<String> letterCombinations(String digits) {
        
        Queue<String> q = new LinkedList<>();

        if(digits==null || digits.length()==0)
        return new ArrayList<>(q);

        String[] letters = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

         int[] arr = new int[digits.length()];

         for(int i=0; i<digits.length(); i++)
         {
            arr[i]=digits.charAt(i)-'0';
         }
        q.add("");

        for(int i=0; i<digits.length(); i++)
        {
            String word = letters[arr[i]];
            int size=q.size();

            for(int j=0; j<size; j++)
            {
                String temp=q.poll();

                for (char c : word.toCharArray())
                q.add(temp+c);
            }
        }
        return new ArrayList<>(q);

    }
}