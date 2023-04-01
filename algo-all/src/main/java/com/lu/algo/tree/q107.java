package com.lu.algo.tree;

import java.util.*;

/**
 * @author sheldon
 * @date 2022-04-05
 */
public class q107 {
    public class TreeNode{
        public Integer val;
        public TreeNode left;
        public TreeNode right;
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        if (root==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int size = queue.size();
            while(size>0){
                TreeNode poll = queue.poll();
                list.add(poll.val);
                if (poll.left!=null) {
                    queue.offer(poll.left);
                }
                if (poll.right!=null) {
                    queue.offer(poll.right);
                }
                size--;
            }
            result.add(list);
        }
        Collections.reverse(result);
        return result;
    }
}
