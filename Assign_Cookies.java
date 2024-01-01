class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int size=0;
        int greed=0;

        while(size<s.length && greed<g.length)
        {
            if(s[size]>=g[greed])
            greed++;

            size++;
        }
        return greed;
    }
}
