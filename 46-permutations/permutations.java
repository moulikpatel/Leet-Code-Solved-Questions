class Solution {
    static void permutation(int index,List<List<Integer>> result,int arr[],int n){
        if(index==n){
            List<Integer> t=new ArrayList<>();
            for(int num:arr){
                t.add(num);
            }
            result.add(t);

            return;
        }
        for(int i=index;i<n;i++){
            swap(i,index,arr);
            permutation(index+1,result,arr,n);
            swap(i,index,arr);
        }

    }
    static void swap(int i,int j,int arr[]){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        int n=nums.length;
        permutation(0,result,nums,n);
        return result;
    }
}