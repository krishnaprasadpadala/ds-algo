package com.ds.trees;

import java.util.*;
import java.util.stream.Collectors;

public class VerticalOrderTraversal {

    public static ArrayList<ArrayList<Integer>> verticalOrder(TreeNode root) {
        Map<Integer,ArrayList<Integer>> seqMap = new TreeMap<>();
        Queue<Map<TreeNode,Integer>> q = new LinkedList<>();
        Map<TreeNode,Integer> map = new HashMap<>();
        map.put(root, 0);
        q.add(map);
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0;i<size;i++) {
                Map<TreeNode,Integer> elm = q.poll();
                Map.Entry<TreeNode,Integer> entry = elm.entrySet().stream().findFirst().get();
                TreeNode node = entry.getKey();
                int nodeDepth = entry.getValue();
                seqMap.computeIfAbsent(nodeDepth, k -> new ArrayList<>());
                seqMap.get(nodeDepth).add(node.val);
                if(node.left != null) {
                    map = new HashMap<>();
                    map.put(node.left, nodeDepth-1);
                    q.add(map);
                }
                if(node.right != null) {
                    map = new HashMap<>();
                    map.put(node.right, nodeDepth+1);
                    q.add(map);
                }
            }
        }
        return new ArrayList<>(seqMap.values());
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);

        root.left.left.right = new TreeNode(7);
        System.out.println(verticalOrder(root));

    }
}
