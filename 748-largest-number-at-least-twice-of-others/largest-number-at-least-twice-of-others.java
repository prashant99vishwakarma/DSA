class Solution {
    public int dominantIndex(int[] nums) {
      for(int i=0;i<nums.length;i++){
        boolean flag=true;
        for(int j=0;j<nums.length;j++){
            if(i!=j && nums[i]<nums[j]*2){
                flag=false;
                break;
            }
        }
        if(flag){
            return i;
        }
      } 
      return -1;
    }
}