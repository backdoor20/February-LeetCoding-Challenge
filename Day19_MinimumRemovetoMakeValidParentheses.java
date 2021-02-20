class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb=new StringBuilder();
        char[] ch=s.toCharArray();
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('){
                stack.push(i);
            }else if(ch[i]==')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    ch[i]='*';
                }
            }
        }
        while(!stack.isEmpty()){
            ch[stack.pop()]='*';
        }
        for(int i=0;i<ch.length;i++){
            if(ch[i]!='*')
                sb.append(ch[i]);
        }
        
        return sb.toString();
    }
}