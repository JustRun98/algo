package com.lu.dmsxl.twopointer;

import com.lu.structure.ListNode;

/**
 * @author sheldon
 * @date 2022-09-18
 */
public class Two_q141_2_HasCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != slow) {
            if (fast == null || fast.next == null) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }

}
