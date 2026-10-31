class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> li=new ArrayList<>();
        int ws=p.length();
        int n=s.length();
        int count=0;
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<ws;i++){
            char temp=p.charAt(i);
            if(mp.containsKey(temp)){
                mp.put(temp,mp.get(temp)+1);
            }
            else{
                mp.put(temp,1);
            }
            count++;
        }
        int i=0,j=0;
        while(j<n){
            char temp=s.charAt(j);
            if(mp.containsKey(temp)){
                if(mp.get(temp)>0){
                    count=count-1;
                }
                mp.put(temp,mp.get(temp)-1);
            }
            if((j-i+1)==ws){
                if(count==0){
                    li.add(i);
                }
                char tem=s.charAt(i);
                if(mp.containsKey(tem)){
                      if(mp.get(tem)>=0){
                        count=count+1;
                          }
                    mp.put(tem,mp.get(tem)+1);
                }
                i++;
            }
           j++;
        }
        return li;
    }
}