//package CS162;
//
//public class CS162Lab09 {
//    public static void main(String[] args) {
//        Tree binary_Tree = new Tree(26);
//        binary_Tree.root.left = new TreeNode(5);
//        binary_Tree.root.left.left = new TreeNode(1);
//        binary_Tree.root.right = new TreeNode(77);
//        binary_Tree.root.right.left = new TreeNode(61);
//
//
//        //In-Order traversal
//        System.out.println("IN-ORDER: ");
//        binary_Tree.inOrderTraversal(binary_Tree.root);
//
//        System.out.println();
//        System.out.println("POST-ORDER: ");
//        binary_Tree.postOrderTraversal(binary_Tree.root);
//
//        System.out.println();
//        System.out.println("PRE-ORDER: ");
//        binary_Tree.preOrderTraversal(binary_Tree.root);
//
//        System.out.println();
//        System.out.println("LEVEl-ORDER: ");
//        binary_Tree.levelOrderTraversal(binary_Tree.root);
//    }
//}
//
//class TreeNode{
//    TreeNode left;
//    TreeNode right;
//    int data;
//    TreeNode(){
//    }
//    TreeNode(int data){
//        this.data = data;
//        this.left = null;
//        this.right = null;
//    }
//
//}
//
//class Tree{
//    public TreeNode root = new TreeNode();
//    Tree(){}
//    Tree(int data){
//        this.root = new TreeNode(data);
//    }
//
////    public TreeNode insert(int element,TreeNode node){
////        if(node == null){
////            TreeNode new_node = new TreeNode(element);
////            return new_node;
////        }
////
////        else{
////            if(node.data >= element){
////                node.left = insert(element,node.left);
////                return node;
////            }
////            else{
////                node.right = insert(element,node.right);
////                return node;
////            }
////        }
////    }
//    public void postOrderTraversal(TreeNode node){
////        System.out.println();
//        if(node == null){
//            return;
//        }
//        else{
//            postOrderTraversal(node.left);
//            postOrderTraversal(node.right);
//            System.out.print(node.data+",");
//        }
//
//    }
//
//    public void preOrderTraversal(TreeNode node){
////        System.out.println();
//        if(node == null){
//            return;
//        }
//        else{
//            System.out.print(node.data + ",");
//            preOrderTraversal(node.left);
//            preOrderTraversal(node.right);
//
//        }
//
//    }
//
//    public void inOrderTraversal(TreeNode node){
//        if(node == null){
//            return;
//        }
//        else{
//            inOrderTraversal(node.left);
//            System.out.print(node.data + ",");
//            inOrderTraversal(node.right);
//
//        }
//
//    }
//
//}