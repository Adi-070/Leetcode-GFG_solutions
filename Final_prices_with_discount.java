class Solution {
    public int[] finalPrices(int[] prices) {
        
      //  int[] final = new int[prices.length];

        for(int i=0; i<prices.length-1; i++)
        {
            int j=i+1;

            while(j<prices.length)
            {
                if(prices[j]<=prices[i]) {
                prices[i]=prices[i]-prices[j];
                    break;
                }
                j++;
            } 
        }
        return prices;
    }
}
