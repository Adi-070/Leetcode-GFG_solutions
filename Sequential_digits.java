class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        String dig="123456789";

        List<Integer> list = new ArrayList<>();

        int lenl = String.valueOf(low).length();
        int lenh = String.valueOf(high).length();

        for(int i=lenl; i<=lenh; i++)
        {
            for(int j=0; j<10-i; j++)
            {
                int num=Integer.parseInt(dig.substring(j,j+i));

                if(num>=low && num<=high)
                list.add(num);
            }
        }
        return list;
    }
}
