class Solution {
    public int countGoodSubstrings(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        int i=0,j=0;
        int n=s.length();
        int count=0;
        while(j<n){
            if(mp.containsKey(s.charAt(j))){
                mp.put(s.charAt(j),mp.get(s.charAt(j))+1);
            }
            else{
                mp.put(s.charAt(j),1);
            }
            if((j-i+1)==3){
                if(mp.size()==3){
                    count++;
                }
                if(mp.get(s.charAt(i))==1){
                    mp.remove(s.charAt(i));
                }
                else{
                    mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
                }
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return count;
    }
}