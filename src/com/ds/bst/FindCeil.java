package com.ds.bst;

import com.ds.trees.TreeNode;

public class FindCeil {

    public static int findCeil(TreeNode root, int key, int val) {
        if(root == null) {
            return val;
        }
        if(root.val == key) {
            return root.val;
        }
        if(root.val > key) {
            val = root.val;
            return findCeil(root.left, key, val);
        } else {
            return findCeil(root.right, key, val);
        }
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(4);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(8);

        int key = 19;
        int val = findCeil(root, key, -1);
        System.out.println("Ceil of "+key+" is "+val);
    }

}
