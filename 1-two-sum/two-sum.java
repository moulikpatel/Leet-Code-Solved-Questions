class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        int result[]=new int[2];
        for(int i=0;i<n;i++){
            mp.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            int toFind=target-nums[i];
            if(mp.containsKey(toFind) && i!=mp.get(toFind)){
                result[0]=i;
                result[1]=mp.get(toFind);
                return result;
            }
        }
        return result;
        
    }
}