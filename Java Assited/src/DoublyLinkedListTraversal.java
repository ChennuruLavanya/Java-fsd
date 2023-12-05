class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;

    
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
            newNode.prev = current;
        }
    }

    
    void traverseForward() {
        if (head == null) {
            System.out.println("The doubly linked list is empty.");
            return;
        }

        Node current = head;

        System.out.println("Doubly Linked List (Forward):");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    void traverseBackward() {
        if (head == null) {
            System.out.println("The doubly linked list is empty.");
            return;
        }

        Node current = head;

      
        while (current.next != null) {
            current = current.next;
        }

        System.out.println("Doubly Linked List (Backward):");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }

        System.out.println();
    }
}

public class DoublyLinkedListTraversal {
    public static void main(String[] args) {
        DoublyLinkedList doublyList = new DoublyLinkedList();

        
        doublyList.insertAtEnd(1);
        doublyList.insertAtEnd(2);
        doublyList.insertAtEnd(3);
        doublyList.insertAtEnd(4);

        
        doublyList.traverseForward();

        
        doublyList.traverseBackward();
    }
}
