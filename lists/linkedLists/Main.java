import javax.print.attribute.standard.PrinterURI;

public class Main {
    public static void main(String[] args) {

        Student vrs = new Student("Vaibhav Raj", "Singh", 10687);
        Student sarvar = new Student("Sarvar", "Abbas", 10693);
        Student shubham = new Student("Shubham", "Ratnakar", 10691);
        Student priyanshu = new Student("Priyanshu", "Pandey", 10684);

        StudentLinkedList list = new StudentLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(sarvar);
        list.addToFront(shubham);
        list.addToFront(vrs);
        list.addToFront(priyanshu);

        System.out.println(list.isEmpty());
        System.out.println(list.getSize());
        list.printList();

        list.removeFromFront();
        // size after removing a node
        System.out.println(list.getSize());
    }
}