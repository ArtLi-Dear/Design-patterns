package 链表;

import java.util.List;

/**
 * 删除链表中等于给定值 val 的所有节点。
 *
 * 示例 1： 输入：head = [1,2,6,3,4,5,6], val = 6 输出：[1,2,3,4,5]
 */
public class 移除元素链表 {
    //    初始化链表
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {

        }

        ;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        /**
         * 虚拟节点方法
         */
        // 定义方法 removeElements 接受一个链表头节点 head 和一个整数值 val 作为参数
        public ListNode removeElements(ListNode head, int val) {
            // 如果链表为空，则直接返回空
            if (head == null) {
                return head;
            }
            // 创建一个虚拟头节点 dummy，值为-1，next指向原链表头节点，这样处理可以在头部删除元素时简化操作
            ListNode dummy = new ListNode(-1, head);
            // 初始化两个指针，pre 指向虚拟头节点，cur 指向原链表头节点
            ListNode pre = dummy;
            ListNode cur = head;

            // 遍历链表
            while (cur != null) {
                // 如果当前节点 cur 的值等于要删除的值 val
                if (cur.val == val) {
                    // pre 的 next 指针跳过 cur，直接指向 cur 的下一个节点，实现删除 cur
                    pre.next = cur.next;
                } else {
                    // 如果当前节点不需要删除，则 pre 向后移动一位
                    pre = cur;
                }
                // cur 向后移动，继续遍历
                cur = cur.next;
            }
            // 遍历结束后，dummy.next 指向的就是新链表的头节点，因为dummy节点在所有真实节点之前
            return dummy.next;
        }
    }
}

