class Solution {
    static void com(int arr[],int n,List<Integer> li,List<List<Integer>> result,int target,int index){
         if(target==0){
            List<Integer> t=new ArrayList<>(li);
            result.add(t);
            return;
        }
        if(index>=n){
            return;
        }
    
        if(arr[index]>target){
            com(arr,n,li,result,target,index+1);
            return;
        }
        li.add(arr[index]);
        com(arr,n,li,result,target-arr[index],index);
        li.remove(li.size()-1);
        com(arr,n,li,result,target,index+1); 
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> li=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        int n=candidates.length;
        com(candidates,n,li,result,target,0);
        return result;
    }
}