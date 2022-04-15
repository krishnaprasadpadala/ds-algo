package com.ds.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BuildTreeFromInAndPostorder {

    public static TreeNode buildTree(ArrayList<Integer> in, ArrayList<Integer> post, HashMap<Integer,Integer> map,
                                     int sin, int ein, int sp, int ep) {

        if(sin > ein) {
            return null;
        }
        int val = post.get(ep);
        TreeNode root = new TreeNode(val);
        int idx = map.get(val);
        int dist = idx - sin;
        root.left = buildTree(in, post, map, sin, idx-1, sp, sp+dist-1);
        root.right = buildTree(in, post, map, idx+1, ein, sp+dist, ep-1);
        return root;
    }

    public static void main(String [] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        ArrayList<Integer> postorder = new ArrayList<>(Arrays.asList(2, 3, 1));
        ArrayList<Integer> inOrder = new ArrayList<>(Arrays.asList(2,1,3));
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<inOrder.size();i++) {
            map.put(inOrder.get(i), i);
        }
        TreeNode result = buildTree(inOrder, postorder, map, 0, postorder.size()-1, 0, inOrder.size()-1);
        ArrayList<Integer> inputPostOrder = PostOrderTraversal.postOrder(root, new ArrayList<>());
        ArrayList<Integer> outPostOrder = PostOrderTraversal.postOrder(result, new ArrayList<>());
        System.out.println("input:" + inputPostOrder);
        System.out.println("output:" + outPostOrder);

    }

}
