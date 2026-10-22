class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int i=0,j=0;
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        long sum=0;
        long max_sum=Long.MIN_VALUE;
        while(j<n){
            sum+=nums[j];
            if(mp.containsKey(nums[j])){
                mp.put(nums[j],mp.get(nums[j])+1);
            }
            else{
                mp.put(nums[j],1);
            }
            if((j-i+1)==k){
                if(mp.size()==k){
                    max_sum=Math.max(max_sum,sum);
                }
                sum=sum-nums[i];
                if(mp.get(nums[i])==1){
                    mp.remove(nums[i]);
                }
                else{
                    mp.put(nums[i],mp.get(nums[i])-1);
                }
                i++;
                j++;

            }
            else{
                j++;
            }
        }

       if(max_sum==Long.MIN_VALUE){
        return 0;
       } 
       return max_sum;
    }
}