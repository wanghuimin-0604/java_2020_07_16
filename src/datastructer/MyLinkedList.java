package datastructer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-16
 * Time:10:51
 * 一万年太久，只争朝夕，加油
 */

/**
 * 无头单向非循环链表
 */
//定义节点信息
class Node {
    //data域和next域
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

        //尾插节点
        //在任意位置插入节点
        //是否包含某个数据
        //删除第一次出现的值为key的节点
        //删除所有值为key的节点
        //链表长度
        //清空
        public  class MyLinkedList {
            Node head = null;
            Node tail = null;

            public MyLinkedList() {
                this.head = head;
                this.tail = this.head;
            }

            public void addFirst(int data) {
                //先生成一个结点
                Node node = new Node(data);
                //在头部插入
                //第一次插入
                if (head == null) {
                    head = node;
                    tail = node;
                    return;
                }
                //链表中已经有元素存在了
                node.next = head;
                head = node;

            }

            public void addLast(int data) {
                Node node = new Node(data);
                if (tail == null) {
                    head= node;
                    tail= node;
                    return;
                }
                //有元素的话，找到最后一个元素，然后插到他的末尾
                tail.next = node;
                tail = node;
            }

            //在任意位置插入节点
            public void add(int index, int data) {
                Node node = new Node(data);
                if (index == 0) {
                    addFirst(data);
                    return;
                }
                if (index == getLength()) {
                    addLast(data);
                    return;
                }
                Node prev = prev(index);
                //找到要插入的位置的前驱节点
                node.next = prev.next;
                prev.next = node;
            }

            //找到某个下标的前驱节点
            public Node prev(int index) {
                Node tmp = head;
                while (index != 1) {
                    tmp = tmp.next;
                    index--;
                }
                return tmp;
            }

            //是否包含key
            public boolean contains(int key) {
                if (head == null) {
                    return false;
                }
                Node tmp = head;
                while (tmp != null) {
                    if (tmp.data == key) {
                        return true;
                    }
                    tmp = tmp.next;
                }
                return false;
            }

            //根据key找下标
            public int getIndex(int key) {
                if (head == null) {
                    return -1;
                }
                Node tmp = head;
                int index = 0;
                while (tmp != null) {
                    if (tmp.data == key) {
                        return index;

                    }
                    index++;
                    tmp = tmp.next;
                }
                return -1;
            }

            //删除key
            public void delete(int key) {
                Node prev = null;
                if (head == null) {
                    return;
                }
                //找到要删除的这个key的前驱节点
                //计算出这个key的下标index
                int index = getIndex(key);
                if (index != -1) {
                    prev = prev(index);
                }
                prev.next = prev.next.next;

            }

            //删除所有的key
            public void deleteAll(int key) {
                //两个指针
                if(head.data==key){
                    head=head.next;
                    return;
                }
                Node prev = head;
                Node cur = head.next;
                while (cur != null) {
                    if (cur.data == key) {
                        prev.next = cur.next;
                        cur = cur.next;
                    }else{
                        prev=cur;
                        cur=cur.next;
                    }
                }
            }

            public int getLength() {
                Node tmp = head;
                int ret = 0;
                while (tmp != null) {
                    ret++;
                    tmp = tmp.next;
                }
                return ret;
            }
            //输出
            public void display(){
                if(head==null){
                    return;
                }
                Node tmp=head;
                while(tmp!=null){
                    System.out.print(tmp.data+" ");
                    tmp=tmp.next;
                }
            }
            //清空链表
            public void clear(){
                head=null;
                System.out.println("链表为空");
            }

            public static void main(String[] args) {
                MyLinkedList l = new MyLinkedList();
                /*l.addFirst(1);
                l.addFirst(2);
                l.addFirst(3);*/
                l.addLast(1);
                l.addLast(2);
                l.addLast(3);
                l.addLast(2);
                l.addLast(4);
                l.addLast(2);
                l.add(3,22);

                System.out.println("链表中是否包含这个元素"+l.contains(22));
                System.out.println("链表长度为"+l.getLength());
                //删除2这个元素
                //l.delete(2);
                l.deleteAll(2);
                //l.clear();
                l.display();

            }
        }