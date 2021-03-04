package com.hebeu.binarytreedemo;

/**
 * @author houyangfan
 * @date 2021/3/4 16:52
 */
public class TreeNode {

    //权
    int value;

    //左节点
    TreeNode leftNode;
    //右节点
    TreeNode rightNode;

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public void frontShow() {
      //首先输出自己的值
      System.out.print(value+" ");
      //进行递归操作 左树也进行相应的操作
        if (leftNode!=null){
            leftNode.frontShow();
        }
        if (rightNode!=null){
            rightNode.frontShow();
        }
    }

    public void mindelShow() {
        if (leftNode!=null){
            leftNode.mindelShow();
        }
        System.out.print(value+" ");
        if (rightNode!=null){
            rightNode.mindelShow();
        }
    }

    public void afterShow() {
        if (leftNode!=null){
            leftNode.mindelShow();
        }
        if (rightNode!=null){
            rightNode.mindelShow();
        }
        System.out.print(value+" ");
    }
}
