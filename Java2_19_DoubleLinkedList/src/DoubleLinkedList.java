
class DoubleNode {
    // 前驱节点
    DoubleNode prev;
    int val;
    // 后继节点
    DoubleNode next;

    public DoubleNode(DoubleNode prev, int val, DoubleNode next) {
        this.prev = prev;
        this.val = val;
        this.next = next;
    }
}

public class DoubleLinkedList {
    private int size;
    // 头结点
    private DoubleNode head;
    // 尾节点
    private DoubleNode last;

    // 尾插
    public void addLast(int data) {
        // 产生一个新节点
        DoubleNode node = new DoubleNode(null,data,null);
        if (head == null) {
            // 此时双向链表没有节点
            head = last = node;
            size ++;
            return;
        }
        // 此时双向链表已经有节点
        node.prev = last;
        last.next = node;
        last = node;
        size ++;
    }

    public void addFirst(int data) {
        DoubleNode node = new DoubleNode(null,data,null);
        if (last == null) {
            head = last = node;
            size ++;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        size ++;
    }

    public void addIndex(int index,int data) {
        if (index < 0|| index > size) {
            System.out.println("索引非法!");
            return;
        }else if (index == 0) {
            addFirst(data);
        }else if (index == size) {
            addLast(data);
        }else {
            // 先找到待插入位置的前驱
            DoubleNode prev = node(index - 1);
            DoubleNode node = new DoubleNode(prev,data,prev.next);
            prev.next = node;
            node.next.prev = node;
            size ++;
        }
    }

    public int get(int index) {
        if (rangeCheck(index)) {
            return node(index).val;
        }
        return -1;
    }

    public void remove(int data) {
        DoubleNode x = head;
        while (x != null) {
            if (x.val == data) {
                // 删除x
                unlink(x);
                break;
            }else {
                x = x.next;
            }
        }
    }

    public void removeAll(int data) {
        DoubleNode x = head;
        while (x != null) {
            if (x.val == data) {
                // 删除x
                DoubleNode next = x.next;
                unlink(x);
                x = next;
            }else {
                x = x.next;
            }
        }
    }

    public void set(int index,int data) {
        if (rangeCheck(index)) {
            node(index).val = data;
            return;
        }
    }

    public void print() {
        DoubleNode x = head;
        while (x != null) {
            System.out.print(x.val +"、");
            x = x.next;
        }
    }

    public int getSize() {
        return size;
    }

    /**
     * 取得index位置的节点
     * @param index
     * @return
     */
    private DoubleNode node(int index) {
        // 若index在中间位置左边
        if (index < (size >> 1)) {
            // 从头向后遍历
            DoubleNode x = head;
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
            return x;
        }else {
            // 从后向前遍历
            DoubleNode x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
            return x;
        }
    }

    private boolean rangeCheck(int index) {
        if (index < 0 || index >= size) {
            System.out.println("索引非法!");
            return false;
        }
        return true;
    }

    /**
     * 将链表中的x节点删除
     * @param x
     */
    private void unlink(DoubleNode x) {
        DoubleNode prev = x.prev;
        DoubleNode next = x.next;
        // 先处理前驱节点
        if (prev == null) {
            head = head.next;
        }else {
            prev.next = next;
            x.prev = null;
        }
        // 处理后继节点
        if (next == null) {
            last = last.prev;
        }else {
            next.prev = prev;
            x.next = null;
        }
        x.val = 0;
        size --;
    }
}
