class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map=new HashMap<>();
        for(char a:s.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(char a:t.toCharArray()){    
            if(map.containsKey(a)){
                int value=map.get(a);
                if(value<=0)
                    return false;
                else
                    map.put(a,value-1);
            }else{
                return false;
            }
        }
        for(char c:map.keySet()){            
            int value=map.get(c);
            if(value!=0)
                return false;
        }
        return true;
    }
}