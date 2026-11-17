class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q=new ArrayDeque<>();
        int i=0,j=0;
        int n=nums.length;
        int arr[]=new int[n-k+1];
        int index=0;
        while(j<n){
            while(!q.isEmpty() && nums[j]>q.peekLast()){
                q.pollLast();
            }
            q.add(nums[j]);
            if((j-i+1)==k){
                arr[index++]=q.peek();
                if(nums[i]==q.peek()){
                    q.remove();
                }
                i++;
            }
            j++;
        }
        return arr;
    }
}