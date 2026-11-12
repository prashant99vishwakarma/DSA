class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int in=1;
        int de=1;
        int ans = 1;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                de=1;
                in++;
                
            }else if(nums[i]>nums[i+1]){
                in=1;
                de++;
            }else{
                in=1;
                de=1;
            }
            ans = Math.max(ans, Math.max(in, de));
        }
        return ans;
    }
}