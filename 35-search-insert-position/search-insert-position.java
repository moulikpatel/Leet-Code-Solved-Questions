class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int start=0,end=n-1;
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                res=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return res+1;
    }
}