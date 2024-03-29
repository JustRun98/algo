package com.lu.all;

import com.lu.structure.TreeNode;
import com.lu.utils.TreeUtils;
import org.junit.Test;

/**
 * @author sheldon
 * @date 2022-04-05
 */
public class 树_q104_二叉树的最大深度 {

    @Test
    public void test() {
        System.out.println(maxDepth2(TreeUtils.makeTree("[3,9,20,null,null,15,7]")));
    }

    public int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth2(root.left);
        int right = maxDepth2(root.right);
        return Math.max(left, right) + 1;
    }

//    public int maxDepth(TreeNode root) {
//        Queue<TreeNode> queue = new LinkedList<>();
//        if (root == null) {
//            return 0;
//        }
//        queue.offer(root);
//        int depth = 0;
//        while (!queue.isEmpty()) {
//            depth++;
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                TreeNode poll = queue.poll();
//                if (poll.left != null) {
//                    queue.offer(poll.left);
//                }
//                if (poll.right != null) {
//                    queue.offer(poll.right);
//                }
//            }
//        }
//        return depth;
//    }
//
//    public int maxDepth1(TreeNode root) {
//        Queue<TreeNode> queue = new LinkedList<>();
//        int depth = 0;
//        if (root == null) {
//            return depth;
//        }
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            for (int i = 0; i < queue.size(); i++) {
//                TreeNode poll = queue.poll();
//                if (poll.left != null) {
//                    queue.offer(poll.left);
//                }
//                if (poll.right != null) {
//                    queue.offer(poll.right);
//                }
//            }
//            depth += 1;
//        }
//        return depth;
//    }
}
