package com.ds.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class RightView {

    public static ArrayList<Integer> rightView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int depth = 0;
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0;i<size;i++) {
                TreeNode node = q.poll();
                map.put(depth, node.val);
                if(node.left != null) {
                    q.add(node.left);
                }
                if(node.right != null) {
                    q.add(node.right);
                }
            }
            depth++;
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String [] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.right = new TreeNode(7);
        ArrayList<Integer> result = rightView(root);
        System.out.println(result);

    }

}
