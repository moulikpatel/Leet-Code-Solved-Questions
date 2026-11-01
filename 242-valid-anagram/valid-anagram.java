class Solution {
    public boolean isAnagram(String s, String t) {
     int n1=s.length();
     int n2=t.length();
     if(n1!=n2){
        return false;
     }
     int count=0;
     HashMap<Character,Integer> mp=new HashMap<>();
     for(int i=0;i<n1;i++){
        char temp=s.charAt(i);
        if(mp.containsKey(temp)){
            mp.put(temp,mp.get(temp)+1);
        }
        else{
            mp.put(temp,1);
        }
        count++;
     }
      for(int i=0;i<n2;i++){
        char temp=t.charAt(i);
        if(mp.containsKey(temp)){
           if(mp.get(temp)==1){
            mp.remove(temp);
           }
           else{
            mp.put(temp,mp.get(temp)-1);
           }
           count--;
        }
     }
     if(count==0){
        return true;
     }
     return false;
    }
}