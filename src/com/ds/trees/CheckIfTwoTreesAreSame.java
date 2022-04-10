package com.ds.trees;

public class CheckIfTwoTreesAreSame {

    public static boolean isSameTree(TreeNode rootA, TreeNode rootB) {
        if((rootA == null && rootB != null) || (rootA != null && rootB == null)) {
            return false;
        }
        if(rootA == null && rootB == null) {
            return true;
        }
        int a = rootA.val;
        int b = rootB.val;
        if(a != b) {
            return false;
        }
        return (isSameTree(rootA.left,rootB.left) && isSameTree(rootA.right, rootB.right));
    }

    public static void main(String [] args) {
        TreeNode rootA = new TreeNode(1);
        rootA.left = new TreeNode(2);
        rootA.right = new TreeNode(3);
        rootA.left.left = new TreeNode(4);
        rootA.left.right = new TreeNode(5);
        rootA.right.right = new TreeNode(6);

        TreeNode rootB = new TreeNode(1);
        rootB.left = new TreeNode(2);
        rootB.right = new TreeNode(3);
        rootB.left.left = new TreeNode(4);
        rootB.left.right = new TreeNode(5);
        rootB.right.right = new TreeNode(6);

        System.out.println("Are both trees same: "+isSameTree(rootA, rootB));

    }
}
