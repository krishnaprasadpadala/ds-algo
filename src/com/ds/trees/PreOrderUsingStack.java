package com.ds.trees;

import java.util.ArrayList;
import java.util.Stack;

public class PreOrderUsingStack {

    public static ArrayList<Integer> preOrder(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curr = root;
        while(!stack.isEmpty() || curr != null) {
            if(curr != null) {
                result.add(curr.val);
                stack.push(curr);
                curr = curr.left;
            } else {
                TreeNode node = stack.pop();
                curr = node.right;
            }
        }
        return result;
    }

    public static void main (String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(6);
        ArrayList<Integer> result = preOrder(root);
        System.out.println(result);
    }


}
