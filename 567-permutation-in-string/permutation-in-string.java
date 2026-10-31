class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int ws=s1.length();
        HashMap<Character,Integer> mp=new HashMap<>();
        int n=s2.length();
        int count=ws;
        for(int i=0;i<ws;i++){
            char temp=s1.charAt(i);
            if(mp.containsKey(temp)){
                mp.put(temp,mp.get(temp)+1);
            }
            else{
                mp.put(temp,1);
            }
        }
        int i=0,j=0;
        while(j<n){
            char tem=s2.charAt(j);
            if(mp.containsKey(tem)){
                 if(mp.get(tem)>0){
                     count=count-1;
                 }
                mp.put(tem,mp.get(tem)-1);
               
            }
            if(ws==(j-i+1)){
                if(count==0){
                    return true;
                }
                char tem2=s2.charAt(i);
                if(mp.containsKey(tem2)){
                    if(mp.get(tem2)>=0){
                        count+=1;
                    }
                    mp.put(tem2,mp.get(tem2)+1);
                }
                i++;
            }
            j++;
        }
        return false;
    }
}