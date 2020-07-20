public class StudentLinkedList {

    private StudentNode head;
    private int size;

    public int getSize() {
        return size;
    }

    // point old head to new node and make the new node the new head.
    public void addToFront(Student student) {
        StudentNode node = new StudentNode(student);
        node.setNext(head);
        head = node;
        size++;
    }

    public StudentNode removeFromFront() {

        /* Basically, we want to delete the head and make the next node the new head. */

        // if list is empty, return null.
        if (isEmpty()) {
            return null;
        }

        StudentNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void printList() {
        StudentNode current = head;
        System.out.print("HEAD ->");
        while (current != null) {
            System.out.print(current);
            System.out.print("->");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public boolean isEmpty() {
        return head == null;
    }
}