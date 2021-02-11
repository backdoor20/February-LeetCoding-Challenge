/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        Node it=head;
        //create copy
        while(it!=null){
            Node newNode=new Node(it.val);
            newNode.next=it.next;
            it.next=newNode;
            it=newNode.next;
        }
        
        //setting up random variable
        Node newNodeHead=head.next;
        Node newNode =head.next;
        it=head;
        while(it!=null){
            Node random=it.random;
            if(random!=null)
                newNode.random=it.random.next;
            it=newNode.next;
            if(it!=null)
            newNode=it.next;            
        }
        
        newNode=head.next;
        it=head;
        while(it!=null){
            it.next=newNode.next;
            it=it.next;
            if(it!=null){                
            newNode.next=it.next;            
            newNode=it.next;
            }
        }
        return newNodeHead;
    }
}