
import java.util.Scanner;

// Node class
class Student {

    String name;
    int rollNo;
    float marks;
    Student next;

    Student(String name, int rollNo, float marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        this.next = null;
    }
}

// Linked List class
class StudentManagementSystem {

    Student head = null;

    // Add student
    public void addStudent(String name, int rollNo, float marks) {
        Student newStudent = new Student(name, rollNo, marks);

        if (head == null) {
            head = newStudent;
        } else {
            Student temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newStudent;
        }
        System.out.println("Student added successfully!");
    }

    // Display all students
    public void displayStudents() {
        if (head == null) {
            System.out.println("No students found!");
            return;
        }

        Student temp = head;
        while (temp != null) {
            System.out.println("Name: " + temp.name
                    + ", Roll No: " + temp.rollNo
                    + ", Marks: " + temp.marks);
            temp = temp.next;
        }
    }

    // Search student
    public void searchStudent(int rollNo) {
        Student temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Student Found:");
                System.out.println("Name: " + temp.name
                        + ", Marks: " + temp.marks);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Student not found!");
    }

    // Delete student
    public void deleteStudent(int rollNo) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        // If head needs to be deleted
        if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Student deleted!");
            return;
        }

        Student temp = head;
        Student prev = null;

        while (temp != null && temp.rollNo != rollNo) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Student not found!");
        } else {
            prev.next = temp.next;
            System.out.println("Student deleted!");
        }
    }
}

// Main class
public class StudentManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter roll number: ");
                    int roll = sc.nextInt();

                    System.out.print("Enter marks: ");
                    float marks = sc.nextFloat();

                    sms.addStudent(name, roll, marks);
                    break;

                case 2:
                    sms.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter roll number to search: ");
                    int searchRoll = sc.nextInt();
                    sms.searchStudent(searchRoll);
                    break;

                case 4:
                    System.out.print("Enter roll number to delete: ");
                    int deleteRoll = sc.nextInt();
                    sms.deleteStudent(deleteRoll);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
