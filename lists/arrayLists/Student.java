public class Student {
    private String firstName;
    private String lastName;
    private int rollNo;

    public Student(String firstName, String lastName, int rollNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNo = rollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName='" + firstName + '\'' + ", lastname='" + lastName + '\'' + ", rollNo='" + rollNo
                + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Student student = (Student) obj;

        if(rollNo != student.rollNo) return false;
        if(!firstName.equals(student.firstName)) return false;
        return lastName.equals(student.lastName);
    }
}
