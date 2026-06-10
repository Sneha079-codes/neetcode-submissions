class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer, Integer> res = new HashMap<>();

        for(int num:nums){
            res.put(num, res.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)-> res.get(b)-res.get(a));
        maxHeap.addAll(res.keySet());

        int[] result = new int[k];
        for(int i =0; i<k; i++){
            result[i] = maxHeap.poll();
        }
        return result;
    }
}