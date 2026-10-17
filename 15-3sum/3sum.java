class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List <List<Integer>> result=new ArrayList<>();
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            while(j<k){
                List<Integer>li=new ArrayList<>();
                sum=arr[i]+arr[j]+arr[k];
                if(sum==0){
                    li.add(arr[i]);
                    li.add(arr[j]);
                    li.add(arr[k]);
                    result.add(li);
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]){
                        j++;
                    }
                    while(j<k && arr[k]==arr[k+1]){
                        k--;
                    }
                }
                else if(sum>0){
                    k--;
                }
                else{
                    j++;
                }
            }

        }
        return result;

        
        
    }
}