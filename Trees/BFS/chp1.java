package Trees.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class chp1 {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
        public List<List<Integer>> solve(Node node){
            List<List<Integer>> ans=new ArrayList<>();
            if(node==null)return ans;
            Queue<Node> q=new LinkedList<>();
            q.offer(node);
            while(q.size()!=0){
                int levelsize=q.size();
                List<Integer>currlevel=new ArrayList<>();
                for(int i=0;i<levelsize;i++){
                    Node currnode=q.poll();
                    currlevel.add(currnode.val);
                    if(currnode.left!=null)q.offer(currnode.left);
                    if(currnode.right!=null)q.offer(currnode.right);
                }
                ans.add(currlevel);
            }
            return ans;
        }



    }
}
