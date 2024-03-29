package com.lu.all;

import com.lu.structure.TreeNode;
import com.lu.utils.TreeUtils;
import org.junit.Test;

/**
 * @author sheldon
 * @date 2022-10-08
 */
public class 树_q101_对称二叉树 {

    @Test
    public void test() {
        System.out.println(isSymmetric(TreeUtils.makeTree("[1,2,2,null,3,null,3]")));
    }

    public boolean isSymmetric(TreeNode root) {
        return temp(root.left, root.right);
    }

    private boolean temp(TreeNode left, TreeNode right) {
        if ((left == null && right == null)) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return left.val == right.val && temp(left.left, right.right) && temp(left.right, right.left);
    }

//
//    public boolean isSymmetric1(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        return compare(root.left, root.right);
//    }
//
//    public boolean compare(TreeNode left, TreeNode right) {
//        if ((left == null && right != null) ||
//                (left != null && right == null)
//        ) {
//            return false;
//        }
//        if (left == null && right == null) {
//            return true;
//        }
//        if ((left.val != right.val)){
//            return false;
//        }
//        return compare(left.left, right.right) && compare(left.right, right.left);
//    }
//
//    public boolean isSymmetric(TreeNode root) {
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            ArrayList<Integer> ints = new ArrayList<>();
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                TreeNode poll = queue.poll();
//                if (poll!=null){
//                    ints.add(poll.val);
//                }else {
//                    ints.add(null);
//                    continue;
//                }
//                queue.offer(poll.left);
//                queue.offer(poll.right);
//            }
//            if (!isSymmetric(ints)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public boolean isSymmetric(ArrayList<Integer> ints) {
//        int left = 0;
//        int right = ints.size() - 1;
//        while (left < right) {
//            if (ints.get(left) != ints.get(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }

}
