class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int a=0;
        for(int i=0;i<nums.length-1;i++){
            int val=nums[i+1]-nums[i];
            a=Math.max(a, val);
        }
        return a;
    }
}