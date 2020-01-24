class Node {
    int item;
    Node next;

    public Node(int item) {
        this.item = item;
        this.next = null;
    }
}

public class SingleLinkList {
    Node head;

    public SingleLinkList() {

    }

    public SingleLinkList(Node head) {
        this.head = head;
    }

    // 链表是否为空
    public static boolean is_empty(Node head) {
        return head == null ? true : false;
    }

    // 链表长度
    public static int length(Node head) {
        if (is_empty(head)) {
            return 0;
        }
        int length = 1;
        Node cur = head;
        while (cur.next != null) {
            length++;
            cur = cur.next;
        }
        return length;
    }

    // 遍历整个链表
    public static void travel(Node head) {
        Node cur = head;
        System.out.println("链表遍历开始！！");
        while (cur != null) {
            System.out.print(cur.item + " ");
            cur = cur.next;
        }
        System.out.println("\n链表遍历结束！！");
    }

    // 链表头部添加元素
    public static void add(SingleLinkList list, int item) {
        Node node = new Node(item);
        if (is_empty(list.head)) {
            list.head = node;
        } else {
            node.next = list.head;
            list.head = node;
        }
    }

    // 链表尾部添加元素
    public static void append(SingleLinkList list, int item) {
        Node node = new Node(item);
        if (is_empty(list.head)) {
            list.head = node;
        } else {
            Node cur = list.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    // 指定位置添加元素
    public static void insert(SingleLinkList list, int pos, int item) {
        if (pos <= 0) {
            add(list, item);
        } else if (pos >= length(list.head)) {
            append(list, item);
        } else {
            Node node = new Node(item);
            Node pre = list.head;
            for (int i = 0; i < pos - 1; i++) {
                pre = pre.next;
            }
            node.next = pre.next;
            pre.next = node;
        }
    }

    // 删除节点
    public static void remove(SingleLinkList list, int item) {
        Node pre = null;
        Node cur = list.head;
        while (cur != null) {
            if (cur.item == item) {
                if (cur == list.head) {
                    list.head = cur.next;
                } else {
                    pre.next = cur.next;
                }
                break;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
    }

    // 查找节点是否存在
    public static boolean search(Node head, int item) {
        Node cur = head;
        while (cur != null) {
            if (cur.item == item) {
                return true;
            } else {
                cur = cur.next;
            }
        }
        return false;
    }
}