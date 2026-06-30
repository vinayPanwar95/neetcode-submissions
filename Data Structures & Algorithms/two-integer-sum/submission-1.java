class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            int currNum = nums[i];
            if(freqMap.containsKey(currNum)){
                return new int[]{freqMap.get(currNum), i};
            }else{
                freqMap.put((target - currNum), i);
            }
        }

        return new int[]{-1, -1};

    }
}
