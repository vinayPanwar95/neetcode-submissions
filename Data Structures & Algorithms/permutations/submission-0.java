class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrace(nums, used, new ArrayList<>() ,result );
        return result;
        
    }
    private void backtrace(int[] nums, boolean[] used, List<Integer> curr,List<List<Integer>> result ){
        if(curr.size() ==nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i = 0 ; i < nums.length; i++){
            if(used[i]){
                continue;
            }
            used[i] = true;
            curr.add(nums[i]);
            backtrace(nums, used,curr, result );

            curr.remove(curr.size() - 1);
            used[i]= false;
            

        }
    }
}
