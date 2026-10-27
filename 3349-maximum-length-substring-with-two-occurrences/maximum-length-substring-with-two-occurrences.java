class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int i=0,j=0;
        HashMap<Character,Integer> mp=new HashMap<>();
        int max=Integer.MIN_VALUE;
        while(j<n){
            char temp=s.charAt(j);
            if(!mp.containsKey(temp)){
                mp.put(temp,1);
            }
            else{
                mp.put(temp,mp.get(temp)+1);
            }
            while(mp.get(temp)>2){
                if(mp.get(s.charAt(i))==1){
                    mp.remove(s.charAt(i));
                }
                else{
                    mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
                }
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}