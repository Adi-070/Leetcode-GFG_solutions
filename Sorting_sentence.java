class Solution {
    public String sortSentence(String s) {
        
        String arr[] = s.split(" ");
        String res[] = new String[arr.length];

        for(int i=0; i<arr.length; i++)
        {
            int k=arr[i].length()-1;
            int m = arr[i].charAt(k)-'0';
            res[m-1]=arr[i].substring(0,k);
        }
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<res.length; i++)
        sb.append(res[i]+" ");

        return sb.toString().trim();
    }
}
