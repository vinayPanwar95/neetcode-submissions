class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrace(nums, 0 , new ArrayList<>(), result);
        return result;
       
    }

    private void backtrace(int[] nums, int start, List<Integer> current, List<List<Integer>> result){

            result.add(new ArrayList<>(current));

            for(int i = start ; i < nums.length; i ++){
                current.add(nums[i]);
              backtrace(nums, i+1 , current, result);
                current.remove(current.size() -1);
            }
    }

  
}