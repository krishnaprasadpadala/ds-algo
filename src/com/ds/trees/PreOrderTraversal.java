package com.ds.trees;

import java.util.ArrayList;

public class PreOrderTraversal {

    public static ArrayList<Integer> preOrder(TreeNode root, ArrayList<Integer> preOrderList) {
        if(root == null) {
            return preOrderList;
        }
        preOrderList.add(root.val);
        preOrder(root.left, preOrderList);
        preOrder(root.right, preOrderList);
        return preOrderList;
    }

    public static void main(String [] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        ArrayList<Integer> result = new ArrayList<Integer>();
        preOrder(root, result);
        System.out.println(result);
    }


}
