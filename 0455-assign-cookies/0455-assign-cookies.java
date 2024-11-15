class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int greed=0, size=0;

        while(greed<g.length && size<s.length)
        {
            if(s[size]>=g[greed])
            greed++;

            size++;
        }
        return greed;
    }
}