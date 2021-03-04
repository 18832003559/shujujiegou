package com.hebeu.binarytreedemo;

/**
 *
 * 二叉树
 * @author houyangfan
 * @date 2021/3/4 16:52
 */
public class BinaryTree {

    TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void frontShow() {

        root.frontShow();
    }

    public void mindleShow() {
        root.mindelShow();
    }

    public void afterShow() {
        root.afterShow();
    }
}
