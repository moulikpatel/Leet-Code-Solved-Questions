class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0,j=i+1;
        if(n==1){
            return;
        }
        while(j<n){
            if(nums[i]!=0){
                i++;
                j++;
            }
            else if(nums[j]==0){
                j++;
            }
           else{
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
        }
}
}