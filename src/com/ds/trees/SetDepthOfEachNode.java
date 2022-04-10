package com.ds.trees;

import java.util.ArrayList;

public class SetDepthOfEachNode {

    private static void setDepth(TreeNode root, int depth) {
        if(root == null) {
            return;
        }
        int currDep = depth + 1;
        root.depth = currDep;
        System.out.println("Depth of "+root.val+" is "+currDep);
        setDepth(root.left, currDep);
        setDepth(root.right, currDep);
    }

    public static void main (String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);

        root.right.right = new TreeNode(60);
        setDepth(root, 0);

    }

}
