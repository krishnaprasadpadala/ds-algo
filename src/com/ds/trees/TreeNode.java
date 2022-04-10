package com.ds.trees;

public class TreeNode {

    public TreeNode () {

    }

    public TreeNode(int val) {
        this.val = val;
    }

    public int val;
    public TreeNode left;
    public TreeNode right;

    // Initializing depth of each node to -1
    public int depth = -1;
}
