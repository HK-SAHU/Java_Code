public class insertAtAnyIndex {
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            next = null;
        }

    }

    public static class linkedList {
        Node head = null;
        Node tail = null;

        void insertAtBegning(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void insertAtAny(int val, int pos) {
            Node temp = new Node(val);
            Node t = head;
            if (pos == size()) {
                insertAtEnd(val);
                return;
            }
            for (int i = 0; i < pos-1 && t!=null; i++) {
                t = t.next;
            }
            temp.next = t.next;
            t.next = temp;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp=temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtBegning(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(8);
        ll.insertAtBegning(0);
        ll.display();
        ll.insertAtAny(10, 2);
        ll.display();
    }
}
