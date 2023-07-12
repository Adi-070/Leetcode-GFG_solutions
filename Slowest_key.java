class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {

        int max = Integer.MIN_VALUE;
        char c = ' ';

        int arr[] = new int[releaseTimes.length];
        arr[0] = releaseTimes[0];

        for(int i=1; i<releaseTimes.length; i++)
        arr[i] = releaseTimes[i]-releaseTimes[i-1];
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max) {

            max=arr[i];
            c = keysPressed.charAt(i);

            }
            else if(arr[i]==max)
            {
                if(keysPressed.charAt(i)>c)
                c = keysPressed.charAt(i);
            }
        }
        return c;
    }
}
