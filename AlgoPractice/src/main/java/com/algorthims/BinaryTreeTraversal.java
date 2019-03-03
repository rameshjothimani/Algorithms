package com.algorthims;


//Create a binary tree node
class Node{
    int key;
    Node left,right;

    public Node(int key){
        this.key=key;
        left=right=null;
    }
}


//class to make binary tree traversals
public class BinaryTreeTraversal {

    Node root;

     //Pre-Order traversal - Root Left,Right
    private void preOrderTraversal(Node node){

        if(node==null){
            return;
        }

        System.out.println(node.key + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    //InOrder traversal - Left,Root,Right
    private void inOrderTraversal(Node node){

        if (node==null){
            return;
        }

        inOrderTraversal(node.left);
        System.out.println(node.key);
        inOrderTraversal(node.right);

    }

    //PostOrder traversal - Left,Right,Root
    private void postOrderTraversal(Node node){

        if(node==null){
            return;
        }

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.key);

    }

    BinaryTreeTraversal(){
        root=null;
    }

    public static void main(String args[]){
        BinaryTreeTraversal binaryTreeTraversal =new BinaryTreeTraversal();
        binaryTreeTraversal.root=new Node(5);

        binaryTreeTraversal.root.left=new Node(4);
        binaryTreeTraversal.root.right=new Node(6);

        System.out.println("Pre-Order Traversal:");
        binaryTreeTraversal.preOrderTraversal(binaryTreeTraversal.root);

        System.out.println("In-Order Traversal:");
        binaryTreeTraversal.inOrderTraversal(binaryTreeTraversal.root);

        System.out.println("Post-Order Traversal:");
        binaryTreeTraversal.postOrderTraversal(binaryTreeTraversal.root);
    }

}
