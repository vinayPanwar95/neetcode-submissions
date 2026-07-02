class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> freqMap.get(a) - freqMap.get(b));

        for(int num : freqMap.keySet()){

            if(pq.size() < k){
                pq.offer(num);
            } else if(freqMap.get(num) > freqMap.get(pq.peek())){
                pq.poll();
                pq.offer(num);
            }

        }

        int[] res = new int[k];

        for(int i = k -1; i >= 0 ; i--){
            res[i] = pq.poll();
        }

        return res;
    }
}
