class Solution {
    public int findLHS(int[] nums) {
        
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int count=0;
        for(Integer a:map.keySet()){
            System.out.println(a+"  => "+map.get(a));
        }
        for(Integer a:map.keySet()){
            if(map.containsKey((a-1))){
                int c=Math.abs(map.get((a-1))+map.get(a));
                if(c>count){
                    count=c;
                }                
            }
            if(map.containsKey((a+1))){
                int c=Math.abs(map.get((a+1))+map.get(a));
                if(c>count){
                    count=c;
                }
            }
        }
        return count;        
    }
}