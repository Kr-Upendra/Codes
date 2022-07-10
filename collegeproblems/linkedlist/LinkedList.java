package collegeproblems.linkedlist;

class Node {
    int value;
    Node next;

    public Node (int value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedList {

    public Node insertFirst(Node head, int data) {
        var node = new Node(data);
        node.next = head;
        head = node;
        return node;
    }

    public void insertLast(Node head, int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        node.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
    }

    public void display(Node root) {
        while (root != null) {
            System.out.print(root.value + " ");
            root = root.next;
        }
    }

    public static void main(String[] args) {
        var list = new LinkedList();
        Node head = null;
        head = list.insertFirst(head, 10);
        list.insertLast(head, 20);
        list.insertLast(head, 30);
        list.insertLast(head, 40);
        list.display(head);
    }
}
