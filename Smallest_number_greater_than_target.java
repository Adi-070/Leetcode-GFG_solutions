class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        for(int i=0; i<letters.length; i++)
        {
            if(letters[i]>target)
            return letters[i];
        }
        return letters[0];
    }
}

...............................................................................
    
    
    class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int left = 0;
        int right= letters.length-1;

        while(left<=right)
        {
            int mid= left + (right-left)/2;

            if(letters[mid]>target)
            right=mid-1;

            else
            left=mid+1;
        }
        if(left==letters.length)
        return letters[0];

        return letters[left];
    }
}
