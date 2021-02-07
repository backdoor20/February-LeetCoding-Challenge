/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rsvList=new ArrayList<>();
        if(root==null){
            return rsvList;
        }
        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
             int size=qu.size();
             boolean isFirst=true;
             while(size>0){
                 TreeNode head = qu.poll();
                 if(isFirst){                     
                     rsvList.add(head.val);
                     isFirst=false;
                 }
                 if(head.right!=null){
                     qu.offer(head.right);
                 }

                 if(head.left!=null){
                     qu.offer(head.left);
                 }                     
                 size--;
             }    
        }
        return rsvList;
        
    }
}