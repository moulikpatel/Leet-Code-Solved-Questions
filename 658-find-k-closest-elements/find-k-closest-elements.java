class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
         PriorityQueue<ArrayList<Integer>> q =
            new PriorityQueue<>((a, b) -> {
                if (!a.get(0).equals(b.get(0))) {
                    return b.get(0) - a.get(0);
                }
                return b.get(1) - a.get(1);
            });

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            ArrayList<Integer> li = new ArrayList<>();

            int temp = Math.abs(x - arr[i]);

            li.add(temp);
            li.add(arr[i]);

            q.add(li);

            if (q.size() > k) {
                q.poll();
            }
        }
        ArrayList<Integer> result=new ArrayList<>();  
        while (!q.isEmpty()) {
            result.add(q.poll().get(1));
        }
        Collections.sort(result);
return result;
    }
}