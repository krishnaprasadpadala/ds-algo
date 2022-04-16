package com.ds.bst;

import com.ds.trees.TreeNode;

public class FindFloor {

    public static int findFloor(TreeNode root, int key, int val) {
        if(root == null) {
            return val;
        }
        if(root.val == key) {
            return root.val;
        }
        if(root.val > key) {
            return findFloor(root.left, key, val);
        } else {
            val = root.val;
            return findFloor(root.right, key, val);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(4);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(8);

        int key = 2;
        int val = findFloor(root, key, -1);
        System.out.println("Floor of "+key+" is "+val);
    }
}
