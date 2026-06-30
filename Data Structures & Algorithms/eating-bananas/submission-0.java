class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int ans = r;
        while(l <= r){

            int mid = l + (r - l) / 2;
            if(canEat(piles, h, mid)){
                ans = mid;
                r = mid -1;
            }else{
                l = mid+1;
            }
        }
        return ans;
        
    }

    private boolean canEat(int[] piles, int h, int k){
        long hrs = 0;

        for(int pile : piles){
            hrs += (pile + k -1)/k;
        }
        return hrs <= h;
    }
}
