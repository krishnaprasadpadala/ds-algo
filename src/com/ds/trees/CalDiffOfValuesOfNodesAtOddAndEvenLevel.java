package com.ds.trees;

import java.util.HashMap;

public class CalDiffOfValuesOfNodesAtOddAndEvenLevel {

    public static void getOddAndEvenSum(TreeNode root, int depth, HashMap<String, Integer> map) {
        if (root == null) {
            return;
        }
        depth = depth + 1;
        if (depth % 2 == 0) {
            int evenSum = map.get("evenSum") + root.val;
            map.put("evenSum", evenSum);
        } else {
            int oddSum = map.get("oddSum") + root.val;
            map.put("oddSum", oddSum);
        }
        getOddAndEvenSum(root.left, depth, map);
        getOddAndEvenSum(root.right, depth, map);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("oddSum", 0);
        map.put("evenSum", 0);
        getOddAndEvenSum(root, 0, map);
        int sum = (map.get("oddSum") - map.get("evenSum"));
        System.out.println("sum: "+sum);
    }
}
