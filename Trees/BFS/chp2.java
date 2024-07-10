package Trees.BFS;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class chp2 {
    public int solve(Node root,int value){
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
                Node currval=q.poll();
                if(currval.left!=null)q.offer(currval.left);
                if(currval.right!=null)q.offer(currval.right);
                if(currval.val==value)break;

            }
        return q.poll().val;

    }
}
