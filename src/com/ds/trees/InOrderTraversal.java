package com.ds.trees;

import java.util.ArrayList;

public class InOrderTraversal {

    public static ArrayList<Integer> inOrder(TreeNode root, ArrayList<Integer> inorderList) {
        if(root == null) {
            return inorderList;
        }
        inOrder(root.left, inorderList);
        inorderList.add(root.val);
        inOrder(root.right, inorderList);
        return inorderList;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        ArrayList<Integer> result = new ArrayList<Integer>();
        inOrder(root, result);
        System.out.println(result);
    }
}
