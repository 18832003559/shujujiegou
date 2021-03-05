package com.hebeu.binarytreedemo;

/**
 * @author houyangfan
 * @date 2021/3/4 16:55
 */
public class Test {
    public static void main(String[] args) {
        //创建一个树
        BinaryTree binaryTree=new BinaryTree();

        //创建一个根节点
        TreeNode treeNode=new TreeNode(1);
        //创建两个子节点
        TreeNode leftNode=new TreeNode(2);
        TreeNode rightNode=new TreeNode(3);
        TreeNode leftNode1=new TreeNode(4);
        TreeNode leftNode2=new TreeNode(6);
        TreeNode rightNode1=new TreeNode(5);
        TreeNode rightNode2=new TreeNode(7);
        leftNode.setLeftNode(leftNode1);
        leftNode.setRightNode(rightNode1);
        rightNode.setLeftNode(leftNode2);
        rightNode.setRightNode(rightNode2);
        //把新创建的两个子节点赋给根节点
        treeNode.setLeftNode(leftNode);
        treeNode.setRightNode(rightNode);
        //把根节点赋给树
        binaryTree.setRoot(treeNode);

        /*//遍历二叉树 前序遍历，先输出自己的值，然后是左树的然后是右树的
        binaryTree.frontShow();
        System.out.println();
        //遍历二叉树 中序遍历，先输出左节点的值，然后是自己的 最后是右节点
        binaryTree.mindleShow();
        System.out.println();
        //后序遍历，先输出右节点再输出左节点 最后是自己
        binaryTree.afterShow();*/


        //二叉树的查找 前序查找
       TreeNode treeNode1= binaryTree.frontSearch(7);
        System.out.println(treeNode1.getValue());
    }

}
