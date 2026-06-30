class Solution {
    public int trap(int[] h) {
        int l = 0, r = h.length -1;
        int maxL= 0, maxR=0, water=0;

        while(l<r){
            if(h[l] < h[r]){

                if(h[l] >= maxL){
                    maxL = h[l];
                }else{
                    water += maxL - h[l];
                    
                }
                l++;
            }else{
                if(h[r] >= maxR){
                    maxR = h[r];
                }else{
                    water += maxR - h[r];
                   
                }
                 r--;
            }
        }
        return water;
    }
}
