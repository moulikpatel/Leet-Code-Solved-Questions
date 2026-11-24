class Solution {
    static void addSubsets(int arr[],int n,int i,List<Integer> li,List<List<Integer>> result){
        if(i==n){
            result.add(new ArrayList<>(li));
            return;
        }
        li.add(arr[i]);
        addSubsets(arr,n,i+1,li,result);
        li.remove(li.size()-1);
        addSubsets(arr,n,i+1,li,result);
    }
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<Integer> li=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        addSubsets(nums,n,0,li,result);
        return result;
    }
}