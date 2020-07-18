import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Vaibhav Raj", "Singh", 10687));
        studentList.add(new Student("Sarvar", "Abbas", 10693));
        studentList.add(new Student("Sankarsan", "Saha", 10650));

        // print each elem
        studentList.forEach(student -> System.out.println(student));

        // get second elem
        System.out.println(studentList.get(1));

        // check if list is empty
        System.out.println(studentList.isEmpty());

        // edit an elem
        studentList.set(2, new Student("Shubham", "Ratnakar", 10691));

        // lambda function for printing each elem
        studentList.forEach(student -> System.out.println(student));

        // print current no of elems
        System.out.println(studentList.size());

        // add new student to end of list
        studentList.add(new Student("Ayush", "Kumar", 10694));

        System.out.println(studentList.size());

        /*
         * The next two lines make use of the custome defined equals method in
         * Student.java
         */

        // check if a particular elem is there
        System.out.println(studentList.contains(new Student("Sarvar", "Abbas", 10693)));

        // check the position of an elem
        System.out.println(studentList.indexOf(new Student("Sarvar", "Abbas", 10693)));

        // delete an elem
        studentList.remove(2);
        studentList.forEach(student -> System.out.println(student));
    }
}