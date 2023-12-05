class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SortedCircularLinkedList {
    Node head;

 
    void insert(int data) {
        Node newNode = new Node(data);

        
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node current = head;

            
            while (current.next != head && current.next.data < data) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
    }

    void displayList() {
        if (head == null) {
            System.out.println("The circular linked list is empty.");
            return;
        }

        Node current = head;

        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }
}

public class SortedCircularLinkedList {
    public static void main(String[] args) {
        SortedCircularLinkedList circularList = new SortedCircularLinkedList();

 
        circularList.insert(1);
        circularList.insert(3);
        circularList.insert(5);
        circularList.insert(7);

        System.out.println("Original Sorted Circular Linked List:");
        circularList.displayList();

     
        int newElement = 4;
        circularList.insert(newElement);

        System.out.println("Sorted Circular Linked List after inserting " + newElement + ":");
        circularList.displayList();
    }
}
