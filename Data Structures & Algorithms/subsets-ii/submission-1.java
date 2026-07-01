class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        
        backtrace(nums, 0 , new ArrayList<>(), result);
        return result;
        
    }

    private void backtrace(int[] nums, int index, List<Integer> curr, List<List<Integer>> result){
        result.add(new ArrayList<>(curr));

        for(int i = index; i < nums.length; i ++){

            if(i > index && nums[i] == nums[i-1]) continue;
           
            curr.add(nums[i]);

            backtrace(nums, i + 1, curr, result);
           
            curr.remove(curr.size()-1);
        }

        
    }
}
