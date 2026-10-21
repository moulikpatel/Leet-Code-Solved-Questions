class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0,j=0;
        int n=nums.length;
        double Max_avg=Double.NEGATIVE_INFINITY;
        double avg=0;
        int sum=0;
        while(j<n){
            sum+=nums[j];
            if((j-i+1)==k){
                avg=(double)sum/k;
                Max_avg=Math.max(Max_avg,avg);
                sum=sum-nums[i];
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return Max_avg;
    }
}