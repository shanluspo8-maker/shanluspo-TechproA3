import java.util.ArrayList;

class Student {

    private int id;
    private String name;

    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("STUDENT CREATED: " + name);
    }

    // Display Info
    void displayInfo() {
        System.out.println("ID: " + id + " | Name: " + name);
    }

    // Garbage Collector Method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("GARBAGE COLLECTOR DESTROYING STUDENT OBJECT: " + name);
        super.finalize();
    }
}

public class Satwork8 {

    public static void main(String[] args) {

        System.out.println("STUDENT RECORD SYSTEM");

        // Create ArrayList of students
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Z"));
        students.add(new Student(2, "Arthel"));
        students.add(new Student(3, "Zelly Bor"));

        System.out.println("\nSTUDENT RECORDS:");
        for (Student s : students) {
            s.displayInfo();
        }

        System.out.println("\nREMOVING STUDENT RECORDS...");
        students.clear();

        System.out.println("REQUESTING GARBAGE COLLECTION...");
        System.gc();

        // Create temporary student objects directly (no variable needed)
        System.out.println("\nCREATING TEMPORARY STUDENT OBJECTS...");
        for (int i = 4; i <= 6; i++) {
            new Student(i, "Student " + i); // no warning now
        }

        System.out.println("REQUESTING GARBAGE COLLECTION AGAIN...");
        System.gc();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("\nPROGRAM ENDED.");
    }
}