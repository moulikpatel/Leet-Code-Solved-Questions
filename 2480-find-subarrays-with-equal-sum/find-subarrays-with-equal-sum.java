class Solution {
    public boolean findSubarrays(int[] arr) {
        int n=arr.length;
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<n-1;i++){
        int sum=arr[i]+arr[i+1];
        if(li.contains(sum)){
            return true;
        }
        li.add(sum);

        }
        return false;
        
    }
}