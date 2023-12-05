class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void deleteNode(int key) {
        Node temp = head;
        Node prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        
        if (temp == null) {
            System.out.println("Key not found in the linked list.");
            return;
        }

        
        prev.next = temp.next;
    }

    void displayList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }
}

public class DeleteFirstSingleLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        linkedList.head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Original Linked List:");
        linkedList.displayList();

        int keyToDelete = 3;
        linkedList.deleteNode(keyToDelete);

        System.out.println("Linked List after deleting node with key " + keyToDelete + ":");
        linkedList.displayList();
    }
}
