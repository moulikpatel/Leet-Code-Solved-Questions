class Solution {
    public int totalFruit(int[] arr) {
        int i=0,j=0;
        int n=arr.length;
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        HashMap<Integer,Integer> mp=new HashMap<>();
        while(j<n){
            if(mp.containsKey(arr[j])){
                mp.put(arr[j],mp.get(arr[j])+1);
                sum=sum+1;
            }
            else{
                mp.put(arr[j],1);
                sum=sum+1;
            }
            if(mp.size()<=2){
                if(sum>maxsum){
                    maxsum=sum;
                }
                j++;
                
            }
                else if(mp.size()>2){
                    if(mp.get(arr[i])==1){

                        mp.remove(arr[i]);
                    }
                    else{
                        mp.put(arr[i],mp.get(arr[i])-1);
                    }
sum=sum-1;
i++;
j++;
                    
                }
            else{
                j++;
            }
            
        }
       return maxsum;
        
    }
}