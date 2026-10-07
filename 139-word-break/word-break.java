class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp= new boolean[s.length()+1];
        dp[0]=true;

        for(int i=0;i<s.length();i++){
            if(!dp[i]){
                continue;
            }
            for(int j=i+1;j<=s.length();j++){
                String part=s.substring(i,j);

                if(wordDict.contains(part)){
                    dp[j]=true;
                }
            }
        }
        return dp[s.length()];
    }
}