class Solution {
    static void combinations(int n,int k,int i,List<Integer> li,List<List<Integer>> result){
        if(li.size()==k){
            result.add(new ArrayList<>(li));
            return;
        }
        if(i>n){
            return;
        }
        li.add(i);
        combinations(n,k,i+1,li,result);
        li.remove(li.size()-1);
        combinations(n,k,i+1,li,result);
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        combinations(n,k,1,li,result);
        return result;

    }
}