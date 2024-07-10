package Trees;

import java.sql.Struct;

public class BST {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;
        public Node(int value){
            this.value=value;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;
    private BST(){

    }
    public int height(Node node){
        if(node==null)return -1;
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void insert(int value){
        root=insert(value,root);
    }
    private Node insert(int value,Node node){
        if(node==null){
            node=new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(value,node.left);
        }
        if(value>node.value){
            node.right=insert(value,node.right);
        }
        node.height=(Math.max(height(node.left),height(node.right)))+1;
        return node;
    }
    public void populate(int [] nums){
        for(int i=0;i< nums.length;i++){
            this.insert(nums[i]);
        }
    }
    public void populateSorted(int []nums){
        populateSorted(nums,0,nums.length);
    }
    private void populateSorted(int []nums,int st,int end){
        if(st<end)return ;
        int mid=st+(end-st)/2;
        this.insert(nums[mid]);
        populateSorted(nums,st,mid);
        populateSorted(nums,mid+1,end);
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null)return true;
        return Math.abs(height(node.left)-height(node.right))<=1 &&balanced(node.left)&&balanced(node.right);
    }
    public void display(){
        display(this.root,"Root Node :");
    }
    public void display(Node node , String details){
        if(node==null)return;
        System.out.println(details+node.getValue());
        display(node.left,"Left child of "+node.getValue()+" : ");
        display(node.right,"Right child of "+node.getValue()+" : ");
    }

    public static void main(String[] args) {
        BST tree=new BST();
        int []nums={7,6,3,21,8,1,2,3,5,9,0};
        tree.populate(nums);
        tree.display();
    }


}
