//手写单链表
public class LinkedList<T> {


    static class Node<T> {

        Node next;
        T value;

        public Node() {
            this.value = null;
            this.next = null;
        }

        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    public void headcha(T value) {
        Node<T> newNode = new Node<>(value);
        System.out.println(123);
        //无哨兵版本
    }

    public LinkedList<T> weicha() {
        return null;
    }
}
