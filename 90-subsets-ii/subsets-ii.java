class Solution {
    static void addSubsets(int arr[],int n,int i,List<Integer> li,List<List<Integer>> result){
        if(i==n){
            List<Integer> temp=new ArrayList<>(li);
            if(result.contains(temp)){
               return;
            }
            else{
                result.add(temp);
            }
            
            return;
        }
        li.add(arr[i]);
        addSubsets(arr,n,i+1,li,result);
        li.remove(li.size()-1);
        addSubsets(arr,n,i+1,li,result);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         int n=nums.length;
         Arrays.sort(nums);
        List<Integer> li=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        addSubsets(nums,n,0,li,result);
        return result;
    }
}