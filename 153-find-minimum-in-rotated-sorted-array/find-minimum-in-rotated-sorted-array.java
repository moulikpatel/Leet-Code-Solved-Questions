class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int start=0,end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int prev=(mid-1+n)%n;
            int next=(mid+1)%n;
            if(nums[mid]<nums[prev] && nums[mid]<nums[next]){
                return nums[mid];
            }
            else if(nums[mid]<nums[end]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return (nums.length==1)?nums[0]:0;
    }
}