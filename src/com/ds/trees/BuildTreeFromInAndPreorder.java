package com.ds.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class BuildTreeFromInAndPreorder {

    public static TreeNode buildTree(ArrayList<Integer> pre, ArrayList<Integer> in, HashMap<Integer,Integer> map,
                                     int spre, int epre, int sin, int ein) {
        if(sin > ein) {
            return null;
        }
        TreeNode root = new TreeNode(pre.get(spre));
        int idx = map.get(pre.get(spre));
        int dist = idx - sin;
        root.left = buildTree(pre, in, map, spre+1, spre+dist, sin, idx-1);
        root.right = buildTree(pre, in, map, spre+dist+1, epre, idx+1, ein);
        return root;
    }

    public static void main(String [] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        ArrayList<Integer> preorder = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> inOrder = new ArrayList<>(Arrays.asList(2,1,3));
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<inOrder.size();i++) {
            map.put(inOrder.get(i), i);
        }
        TreeNode result = buildTree(preorder, inOrder, map, 0, preorder.size()-1, 0, inOrder.size()-1);
        ArrayList<Integer> inputPreOrder = PreOrderTraversal.preOrder(root, new ArrayList<>());
        ArrayList<Integer> outputPreOrder = PreOrderTraversal.preOrder(result, new ArrayList<>());
        System.out.println("input:" + inputPreOrder);
        System.out.println("output:" + outputPreOrder);
    }
}
