public class LinkedListOperation {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void pushAtFront(int data) {

    }

    void pushAtTheEnd(int data) {

    }

    void push(int data) {
        Node new_node;
        System.out.println("The Data is pushed" + data);
        if (head == null) {
            new_node = new Node(data);
            head = new_node;
        }else {
            Node n1=head;
            if(n1.next!=null) {
                n1=n1.next;
            }
            new_node = new Node(data);
            n1.next = new_node;
            new_node.next = null;
        }


    }

    void printTheList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }

    }


    void insertAtLocation(int position) {

    }

    void deleteAfter(int position) {

    }

    void deleteSpecficElement(int data) {

    }

    void deleteFirstElement() {

    }

    void deleteLastElement() {

    }

    int sizeOfList() {
        Node n = head;
        int size = 0;
        if (n != null) {
            size++;
            n = n.next;
        }
        return size;
    }


    public static void main(String[] args) {
        System.out.println("The Linked List Opertaion.....");

        //pushing the data onto the list
        LinkedListOperation listOperation = new LinkedListOperation();
        listOperation.push(2);
        listOperation.push(3);
        listOperation.push(4);

        //printing the List
        listOperation.printTheList();

        //The Size of list
        listOperation.sizeOfList();


    }
}
