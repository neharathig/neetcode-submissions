class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int n : nums){
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }



        int[] ans = new int[k];

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b)-> Integer.compare(b.getValue(), a.getValue()) );

        pq.addAll(hm.entrySet());

       for(int i=0; i <k; i++){
            ans[i] = pq.poll().getKey();
       }


        return ans;
    }
}
