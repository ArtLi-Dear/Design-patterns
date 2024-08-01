package 链表;

/**
 * 在链表类中实现以下功能：
 *
 * get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
 *
 * addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
 *
 * addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
 *
 * addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，
 * 则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
 *
 * deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
 */
public class 设计链表 {
    public static void main(String[] args) {
        // 示例代码可以在这里添加，以测试 MyLinkedList 类的各种方法
    }

    // 定义链表节点类
    static class ListNode {
        int val;
        ListNode next;

        // 节点构造器
        ListNode() {}
        ListNode(int val) { this.val = val; }
    }

    // 实现链表类
    static class MyLinkedList {
        int size; // 存储链表元素数量
        ListNode head; // 虚拟头节点

        // 初始化链表
        public MyLinkedList() {
            size = 0;
            head = new ListNode(0); // 初始化虚拟头节点
        }

        /**
         * 获取链表中第index个节点的值
         * @param index 索引位置
         * @return 节点值 或 -1（如果索引无效）
         */
        public int get(int index) {
            if (index < 0 || index >= size) {
                System.out.println("索引非法!");
                return -1;
            }
            ListNode cur = head.next; // 从虚拟头节点的下一个节点开始遍历
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            return cur.val;
        }

        // 在链表头部添加节点
        public void addAtHead(int val) {
            addAtIndex(0, val);
        }

        // 在链表尾部添加节点
        public void addAtTail(int val) {
            addAtIndex(size, val);
        }

        // 在指定位置添加节点
        public void addAtIndex(int index, int val) {
            if (index > size) {
                return; // 索引过大，不执行插入
            }
            size++; // 先增加链表大小
            if (index <= 0) { // 插入头部或索引非法则调用addAtHead
                addAtHead(val);
            } else if (index == size) { // 尾部插入调用addAtTail
                addAtTail(val);
            } else {
                // 找到插入位置的前驱节点
                ListNode pre = head;
                for (int i = 0; i < index; i++) {
                    pre = pre.next;
                }
                ListNode newNode = new ListNode(val);
                newNode.next = pre.next;
                pre.next = newNode;
            }
        }

        // 删除指定索引的节点
        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) {
                return; // 索引非法，不执行删除
            }
            size--; // 先减少链表大小
            if (index == 0) {
                head = head.next; // 删除头节点
            } else {
                ListNode pre = head;
                for (int i = 0; i < index; i++) {
                    pre = pre.next;
                }
                pre.next = pre.next.next; // 删除目标节点
            }
        }
    }
}