package Trees;

public class AVL {
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
        private AVL(){

        }
        public int  height(){
            return height(root);
        }
        private int height(Node node){
            if(node==null)return -1;
            return node.height;
        }
        public boolean isEmpty(){
            return root==null;
        }
        public void insert(int value){
            root=insert(value,root);
        }
        private Node insert(int value, Node node){
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
            node.height=(Math.max(height(node.left),height(node.right)))+1;     //maximum height of the child nodes +1 for the parent node
            return rotate(node);
        }
        private Node rotate(Node node){
            if(height(node.left)-height(node.right)>1){
                //left heavy
                if(height(node.left.left)-height(node.left.right)>0){
                    return rightrotate(node);
                }
                if(height(node.left.left)-height(node.left.right)<0&node.left.right!=null){
                    node.left=leftrotate(node.left);
                    return rightrotate(node);
                }
            }
            if(height(node.left)-height(node.right)<1){
                //right heavy
                if(height(node.right.left)-height(node.right.right)<0){
                    return leftrotate(node);
                }
                if(height(node.right.left)-height(node.left.right)>0 & node.right.right!=null){
                    node.right=rightrotate(node.right);
                    return leftrotate(node);
                }
            }
            return node;
        }
        public Node rightrotate(Node p){
            Node c=p.left;
            Node t=c.right;
            c.right =p;
            p.left =t;
            p.height=Math.max(height(p.left),height(p.right)+1);
            c.height=Math.max(height(c.left),height(c.right)+1);
            return c;
        }
        public Node leftrotate(Node c){
            Node p=c.left;
            Node t=p.right;
            c.right =t;
            p.left =c;
            p.height=Math.max(height(p.left),height(p.right)+1);
            c.height=Math.max(height(c.left),height(c.right)+1);
            return p;
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
            AVL tree=new AVL();
//            int []nums={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
            for(int i=0;i<1000;i++){
                tree.insert(i);
            }
            System.out.println(tree.height());
        }


    }



