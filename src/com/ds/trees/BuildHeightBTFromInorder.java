package com.ds.trees;

import java.util.ArrayList;
import java.util.Arrays;

public class BuildHeightBTFromInorder {

    public static TreeNode buildTree(int[] arr, int st,int en) {
        if(st > en) {
            return null;
        }
        int idx = (st+en)/2;
        TreeNode root = new TreeNode(arr[idx]);
        System.out.println("Node build for "+arr[idx]);
        root.left = buildTree(arr, st, idx-1);
        root.right = buildTree(arr, idx+1, en);
        return root;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,5,10};
        TreeNode root = buildTree(arr, 0, arr.length-1);
        ArrayList<Integer> inorder = InOrderTraversal.inOrder(root, new ArrayList<>());
        System.out.println("result"+inorder);

    }
}
