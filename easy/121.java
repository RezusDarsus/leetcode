class Solution {
       public int maxProfit(int[] prices) {
        int right = 1;
        int left = 0;
        int max = 0;
      while (right < prices.length){
            int buy  = prices[left];
            int sell =  prices[right];

       if(buy < sell){
           max = Math.max(max,sell- buy);
       }else{
           left = right;
       }
        ++right;

      }
      return max;
    }

}
