package com.ds.bst;

import com.ds.trees.TreeNode;

public class CheckIsBST {

    private static boolean isInRange(TreeNode root, int s, int e) {
        if(root == null) {
            return true;
        }
        if(root.val > s && root.val < e) {
            return isInRange(root.left, s, root.val) && isInRange(root.right, root.val, e);
        }
        return false;
    }

    public static void main(String [] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        boolean isLeftInRange = isInRange(root.left, Integer.MIN_VALUE, root.val);
        boolean isRightInRange = isInRange(root.right, root.val, Integer.MAX_VALUE);
        System.out.println("isBST:" + (isLeftInRange && isRightInRange));
    }
}
