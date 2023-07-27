class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        
        List<String> list = new ArrayList<>();

        for(int i=0; i<words.size(); i++)
        {
            String arr[] = words.get(i).split("["+separator+"]");

            for(int k=0; k<arr.length; k++)
            {
                if(arr[k].length()>0)
                list.add(arr[k]);
            }
        }
        return list;
    }
}
