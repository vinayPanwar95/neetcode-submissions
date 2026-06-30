class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;

        int i = 0;

        while(i < n){
            int currNum = nums[i];
            int correctIndex = nums[i] - 1;
            if(currNum != nums[correctIndex]){
                // swap
                int temp = nums[i];
                 nums[i] = nums[correctIndex];
                 nums[correctIndex] = temp;
            }else{
                if(i != correctIndex){
                    return nums[i];
                }
                i++;
            }
        }
        return -1;
        
    }
}
