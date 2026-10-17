class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list= new ArrayList<>();
        Arrays.sort(nums);
        int count=1;
        for(int i=0;i<nums.length;i++){
            if(i < nums.length - 1 && nums[i] == nums[i + 1]){
                count++;
            }else{
                if(count>nums.length/3){
                list.add(nums[i]);
            }
            count=1;
            }
        }
        return list;
    }
}