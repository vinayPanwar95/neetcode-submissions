class Solution {
    public int search(int[] nums, int t) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int currNum = nums[mid];

            if (currNum == t) {
                return mid;
            } 
            else if (currNum < t) {
                l = mid + 1;
            } 
            else {
                r = mid - 1;
            }
        }

        return -1;
    }
}