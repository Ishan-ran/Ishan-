import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head = null;

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) head = newNode;
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
        System.out.println(data + " inserted");
    }

    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is Empty!");
            return;
        }
        if (head.next == null) {
            System.out.println(head.data + " deleted");
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) temp = temp.next;
        System.out.println(temp.next.data + " deleted");
        temp.next = null;
    }

    void display() {
        if (head == null) {
            System.out.println("List is Empty!");
            return;
        }
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedListMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        int choice;

        do {
            System.out.println("\n1. Insert\n2. Delete\n3. Display\n4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter element: ");
                    list.insertAtEnd(sc.nextInt());
                }
                case 2 -> list.deleteAtEnd();
                case 3 -> list.display();
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }
}