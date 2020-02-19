

// 负责具体存储元素内容，以及存储下个节点地址
// Node类是车厢
class Node {
    private int data;
    Node next;
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

// 火车
public class SingleLinkedList {
    private int size;
    // 永远指向火车车尾车厢
    private Node last;
    // 永远指向火车车头
    private Node first;

    public Node getFirst() {
        return first;
    }

    public void add(int data) {
        addLast(data);
    }

    // 头插法
    public void addFirst(int data) {
        // 产生新节点
        Node node = new Node(data,null);
        if (first == null) {
            first = last = node;
            size ++;
            return;
        }
        node.next = first;
        first = node;
        size ++;
    }

    // 尾插法
    public void addLast(int data) {
        // 产生新车厢
        Node node = new Node(data,null);
        // 此时火车还没有挂载车厢
        if (last == null) {
            last = first = node;
            size ++;
            return;
        }
        // 此时火车已经有节点
        // 要挂载当前最新节点，让最后一个车厢的next指向当前新节点
        last.next = node;
        last = node;
        size ++;
    }

    /**
     * 在链表任意索引处插入新的节点值data
     * @param index
     * @param data
     */
    public void addIndex(int index,int data) {
        if (index < 0 || index > size) {
            System.out.println("索引非法!");
            return;
        }else if (index == size) {
            addLast(data);
        }else if (index == 0) {
            addFirst(data);
        }else {
            // 在中间位置插入新节点 addIndex(1,10)
            Node node = new Node(data,null);
            // 找到待插入index的前驱节点
            Node prev = getIndexNode(index - 1);
            node.next = prev.next;
            prev.next = node;
            size ++;
        }
    }

    /**
     * 根据用户传入的索引值获取节点值
     * @param index
     * @return
     */
    public int get(int index) {
        // 判断index合法性
        if (rangeCheck(index)) {
            Node node = getIndexNode(index);
            return node.getData();
        }
        return -1;
    }

    /**
     * 查询链表中是否有指定内容节点
     * @param data
     * @return
     */
    public boolean contains(int data) {
        // 遍历链表
        Node temp = first;
        while (temp != null) {
            if (temp.getData() == data) {
                System.out.println("找到元素!");
                return true;
            }
            temp = temp.next;
        }
        System.out.println("没有指定元素");
        return false;
    }

    /**
     * 删除第一个值为data的节点
     * @param data
     */
    public void remove(int data) {
//        // 头结点
//        if (first.getData() == data) {
//            first = first.next;
//            size --;
//            return;
//        }else {
//            Node prev = first;
//            while (prev.next != null) {
//                if (prev.next.getData() == data) {
//                    // 此时prev恰好就是待删除节点的前驱节点
//                    prev.next = prev.next.next;
//                    size --;
//                    return;
//                }else {
//                    prev = prev.next;
//                }
//            }
//        }
        // 虚拟头结点 data
        Node dummyHead = new Node(data - 1,null);
        dummyHead.next = first;
        Node temp = dummyHead;
        while (temp.next != null) {
            if (temp.next.getData() == data) {
                // 此时temp就是待删除的前驱节点
                temp.next = temp.next.next;
                size --;
                break;
            }else {
                temp = temp.next;
            }
        }
        first = dummyHead.next;
    }

    /**
     * 删除所有值为data的节点
     * @param data
     */
    public void removeAll(int data) {
//        // 1->1->1->2->3
//        // 1
//        while (first != null && first.getData() == data) {
//            first = first.next;
//            size --;
//        }
//        // 此时头结点一定不是要删除的节点
//        // 1->1->1->1
//        // null
//        if (first == null) {
//            return;
//        }else {
//            // 此时头结点一定不是要删除的节点，并且链表中还有待删除的节点
//            Node prev = first;
//            while (prev.next != null) {
//                if (prev.next.getData() == data) {
//                    prev.next = prev.next.next;
//                    size --;
//                }else {
//                    prev = prev.next;
//                }
//            }
//        }
        // 虚拟头结点
        Node dummyHead = new Node(data - 1,null);
        dummyHead.next = first;
        Node prev = dummyHead;
        while (prev.next != null) {
            if (prev.next.getData() == data) {
                prev.next = prev.next.next;
                size --;
            }else {
                prev = prev.next;
            }
        }
        first = dummyHead.next;
    }

    /**
     * 修改指定index位置的节点为data值
     * @param index
     * @param data
     */
    public void set(int index,int data) {
        // 判断index合法性
        if (rangeCheck(index)) {
            Node node = getIndexNode(index);
            node.setData(data);
        }
    }

    // 遍历一个链表
    public void print() {
//        // 从火车头开始依次遍历直到火车尾
//        Node temp = first;
//        while (temp != null) {
//            System.out.print(temp.getData());
//            // 继续向下一个节点遍历
//            temp = temp.next;
//        }
        for (Node x = first;x != null;x = x.next) {
            System.out.print(x.getData() +"、");
        }
    }

    // 回文链表
    // 原链表: 1->2->3->4->5->null
    // 回文链表: 5->4->3->2->1->null
    // 将原链表遍历一次，边遍历边头插新的链表
    public Node reverse(Node head) {
        // 判断边界
        if (head == null || head.next == null) {
            return head;
        }
        // 当前链表不为空,遍历当前链表,产生新节点头插另一个链表
        Node newHead = new Node(head.getData(),null);
        // 遍历原先链表
        while (head.next != null) {
            // 产生新节点
            Node node = new Node(head.next.getData(),null);
            // 将新节点头插到新链表头部
            node.next = newHead;
            newHead = node;
            head = head.next;
        }
        return newHead;
    }

    // 根据用户传入的index值取得对应的Node节点
    private Node getIndexNode(int index) {
        // 从头结点开始走index步找到对应节点
        Node temp = first;
        // 1->2->3->4->5
        // index = 3
        for (int i = 0;i < index;i++) {
            temp = temp.next;
        }
        return temp;
    }

    private boolean rangeCheck(int index) {
        if (index < 0 || index >= size) {
            System.out.println("索引非法!");
            return false;
        }
        return true;
    }
}
