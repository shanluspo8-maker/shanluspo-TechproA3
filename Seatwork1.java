import java.util.Scanner;

public class Seatwork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        System.out.print("How many grades? ");
        int numGrades = scanner.nextInt();

        double sum = 0;

        for (int i = 1; i <= numGrades; i++) {
            System.out.print("Enter grade " + i + ": ");
            int grade = scanner.nextInt();
            sum += grade;
        }

        double average = sum / numGrades;
        System.out.println("Average: " + average);

        char letterGrade;
        if (average >= 90) {
            letterGrade = 'A';
        } else if (average >= 80) {
            letterGrade = 'B';
        } else if (average >= 70) {
            letterGrade = 'C';
        } else if (average >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        System.out.println("Letter grade: " + letterGrade);

        scanner.close();
    }
}