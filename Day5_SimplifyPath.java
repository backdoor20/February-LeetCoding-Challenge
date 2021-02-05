class Solution {
    public String simplifyPath(String path) {
        
        Deque<String> deque=new LinkedList<>();
        String[] str=path.split("/");
        for(String s:str){
            //System.out.println(s);
            if(!deque.isEmpty() && s.equals("..")) deque.poll();
            else if(!s.equals(".") && !s.equals("") && !s.equals("..")) deque.push(s);
        }
        StringBuilder sb=new StringBuilder();
        if(deque.isEmpty()){
            return "/";
        }
        while(!deque.isEmpty()){
           // sb.insert(0,stack.pop()).insert(0,"/");
            sb.append("/").append(deque.pollLast());
        }
        return sb.toString();        
    }
}