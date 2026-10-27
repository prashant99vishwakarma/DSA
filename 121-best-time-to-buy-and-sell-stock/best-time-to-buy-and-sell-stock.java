class Solution {
    public int maxProfit(int[] prices) {
        int a=prices[0];
        int b=0;
        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-a;
            b=Math.max(b,profit);
            a=Math.min(a,prices[i]);
        }
        return b;
    }
}