class Solution {
    public String removeDuplicateLetters(String s) {
        
        int[] lastIndex = new int[26];
        boolean[] seen = new boolean[26];

        Stack<Integer> stk = new Stack<>();

        for(int i=0; i<s.length(); i++)
        lastIndex[s.charAt(i)-'a']=i;

        for(int i=0; i<s.length(); i++)
        {
            int curr = s.charAt(i)-'a';

            if(seen[curr])
            continue;

            while(!stk.isEmpty() && stk.peek()>curr && i< lastIndex[stk.peek()])
            {
                seen[stk.pop()]=false;
            }
            stk.push(curr);
            seen[curr]=true;
        }
         StringBuilder sb = new StringBuilder();

            while(!stk.isEmpty())
            sb.append((char)(stk.pop()+'a'));

            return sb.reverse().toString();
    }
}
