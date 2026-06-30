class Solution {
    public int maxArea(int[] heights) {

        int maxArea = 0;

        int l = 0, r = heights.length - 1;

        while(l<r){
            int smallerBar = heights[l] >= heights[r] ? heights[r] : heights[l];

            int area = smallerBar * (r -l);

            maxArea = Math.max(maxArea, area);

            if(heights[l] >= heights[r]){
                r--;
            }else{
                l++;
            }
        }
        return maxArea;
        
    }
}
