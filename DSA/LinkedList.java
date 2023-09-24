package DSA;

public class LinkedList {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printItems() {
        if (head == null) {
            System.out.println("the list is empty");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        Node nextNode = head.next;
        while (nextNode.next != null) {
            currNode = currNode.next;
            nextNode = nextNode.next;
        }
        currNode.next = null;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        head = head.next;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("hello");
        list.addLast("world");
        list.printItems();

        System.out.println("Deleting the last item:");
        list.deleteLast();
        list.printItems();

        System.out.println("Deleting the first item:");
        list.deleteFirst();
        list.printItems();
    }
}
