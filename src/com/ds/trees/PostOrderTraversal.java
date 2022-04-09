package com.ds.trees;

import java.util.ArrayList;

public class PostOrderTraversal {

    public static ArrayList<Integer> postOrder(TreeNode root, ArrayList<Integer> postOrderList) {
        if(root == null) {
            return postOrderList;
        }
        postOrder(root.left, postOrderList);
        postOrder(root.right, postOrderList);
        postOrderList.add(root.val);
        return postOrderList;
    }

    public static void main(String [] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        ArrayList<Integer> result = new ArrayList<Integer>();
        postOrder(root, result);
        System.out.println(result);
    }
}
