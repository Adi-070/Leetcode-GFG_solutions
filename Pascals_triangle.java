class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for(int row=1; row<=numRows; row++)
        {
            list.add(find(row));
        }
    return list;
    }
    public List<Integer> find(int rows)
    {
        List<Integer> res = new ArrayList<>();
        res.add(1);

        int ans=1;

        for(int col=1; col<rows; col++)
        {
            ans = ans*(rows-col);
            ans=ans/col;

            res.add(ans);
        }
        return res;
    }
}

................................................................
class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<numRows; i++)
        {
            Integer[] temp = new Integer[i+1];
            Arrays.fill(temp,1);
            ans.add(Arrays.asList(temp));
        }

        for(int i=2; i<numRows; i++)
        {
            for(int j=1; j<ans.get(i).size()-1; j++)
            {
                ans.get(i).set(j,ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
            }
        }
        return ans;
    }
}
