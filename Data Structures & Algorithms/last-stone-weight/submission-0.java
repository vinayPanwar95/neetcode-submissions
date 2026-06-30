class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : stones){
            pq.offer(num);
        }
        
        while(pq.size() >1){
            int s1 = pq.poll();
            int s2 = pq.poll();

            int netWeight = s1 == s2 ? 0 : s1 > s2 ? s1-s2 : s2 -s1;
            pq.offer(netWeight);

        }

        return pq.poll();
    }
}
