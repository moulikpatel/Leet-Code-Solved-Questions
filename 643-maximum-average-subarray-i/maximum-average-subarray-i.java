class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int n=arr.length;
        int sum=0;
        double avg=0;
        double max= Double.NEGATIVE_INFINITY;
        int i=0,j=0;
        while(j<n){
            sum+=arr[j];
            if((j-i+1)==k){
                avg=(double)sum/k;
                max=Math.max(max,avg);
               
                    sum=sum-arr[i];
                i++;
            }
            j++;
        }
        return max;
    }
}