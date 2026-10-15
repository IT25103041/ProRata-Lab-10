import java.util.Scanner;

public class IT25103041Lab10Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mark: ");
        int mark = input.nextInt();

        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println("Mark is Validated");

        char grade;

        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Verify the assigned grade
        char expectedGrade;

        if (mark >= 75) {
            expectedGrade = 'A';
        } else if (mark >= 60) {
            expectedGrade = 'B';
        } else if (mark >= 50) {
            expectedGrade = 'C';
        } else if (mark >= 40) {
            expectedGrade = 'D';
        } else {
            expectedGrade = 'F';
        }

        assert (grade == expectedGrade) : "Incorrect Grade Assigned";

        System.out.println("Grade: " + grade);

        input.close();
    }
}