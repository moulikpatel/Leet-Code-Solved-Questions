class Solution {
    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int res=Integer.MAX_VALUE;
        int sum=0;
        int sumres=0;
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                sum=arr[i]+arr[j]+arr[k];
                int diff=Math.abs(target-sum);
                if(diff<res){
                    res=diff;
                    sumres=sum;
                }
                if(sum==target){
                    j++;
                    k--;
                }
                else if(sum<target){
                    j++;
                }
                else{
                    k--;
                }

            }
        }
        return sumres;
        
    }
}