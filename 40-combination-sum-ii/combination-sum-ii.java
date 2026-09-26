class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),candidates,target,0);
        return result;
    }
    private void backtrack(List<List<Integer>> result,List<Integer> temp,int[] candidates,int target,int start){
        if(target==0){
            result.add(new ArrayList<>(temp));
            return;
        }
        

        for(int i=start;i<candidates.length;i++){
            if(i > start && candidates[i] == candidates[i-1]){
                continue;
        }
            int number=candidates[i];

            if(number>target){
                continue;
            }
            temp.add(number);
            backtrack(result,temp,candidates,target-number,i+1);
            temp.remove(temp.size()-1);
        }
    }
}