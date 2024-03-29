package com.lu.all;

import java.util.*;

/**
 * @author sheldon
 * @date 2022-12-31
 */
public class 模拟_q2032 {

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        BitSet bitSet = new BitSet();
        BitSet bitSet1 = new BitSet();
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            bitSet.set(i);
        }
        for (int i : nums2) {
            if (bitSet.get(i)) {
                set.add(i);
            } else {
                bitSet1.set(i);
            }
        }
        for (int i : nums3) {
            if (bitSet1.get(i) || bitSet.get(i)) {
                set.add(i);
            }
        }

        return new ArrayList<>(set);
    }

}
