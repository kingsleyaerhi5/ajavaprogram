//Step 1 — Create the project + method to print program specifications.
public class QuizGradesApp {

    public static void printSpecifications() {
        System.out.println("========================================");
        System.out.println("Quiz Grades Application Specifications");
        System.out.println("----------------------------------------");
        System.out.println("1) Allows a student to enter up to 10 quiz scores.");
        System.out.println("2) Enter 999 to stop entering scores early.");
        System.out.println("3) Stores scores in an array.");
        System.out.println("4) Prints all scores entered.");
        System.out.println("5) Computes the average score.");
        System.out.println("6) Displays the letter grade based on the average.");
        System.out.println("========================================");
    }

    public static void main(String[] args) {
        printSpecifications();
    }
}

//Step 2 — Input first grade + loop until 999 to quit.
import java.util.Scanner;

public class QuizGradesApp {

    public static void printSpecifications() {
        System.out.println("========================================");
        System.out.println("Quiz Grades Application Specifications");
        System.out.println("----------------------------------------");
        System.out.println("Enter up to 10 quiz scores (0-100).");
        System.out.println("Enter 999 to stop early.");
        System.out.println("========================================");
    }

    public static void main(String[] args) {
        printSpecifications();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first quiz score (or 999 to quit): ");
        int grade = input.nextInt();

        while (grade != 999) {
            System.out.println("You entered: " + grade);

            System.out.print("Enter another quiz score (or 999 to quit): ");
            grade = input.nextInt();
        }

        System.out.println("Done entering grades.");
        input.close();
    }
}

//Step 3 — Store grades in an array (up to 10), keep running total and count.
import java.util.Scanner;

public class QuizGradesApp {

    public static void printSpecifications() {
        System.out.println("========================================");
        System.out.println("Quiz Grades Application Specifications");
        System.out.println("----------------------------------------");
        System.out.println("Enter up to 10 quiz scores (0-100).");
        System.out.println("Enter 999 to stop early.");
        System.out.println("========================================");
    }

    public static void main(String[] args) {
        printSpecifications();

        Scanner input = new Scanner(System.in);

        int[] grades = new int[10];
        int count = 0;
        int total = 0;

        System.out.print("Enter a quiz score (0-100) or 999 to quit: ");
        int grade = input.nextInt();

        while (grade != 999 && count < grades.length) {
            grades[count] = grade;
            total += grade;
            count++;

            if (count < grades.length) {
                System.out.print("Enter a quiz score (0-100) or 999 to quit: ");
                grade = input.nextInt();
            }
        }

        System.out.println("Number of grades entered: " + count);

        input.close();
    }
}

//Step 4 — Print all grades stored in the array (using another loop).
import java.util.Scanner;

public class QuizGradesApp {

    public static void printSpecifications() {
        System.out.println("========================================");
        System.out.println("Quiz Grades Application Specifications");
        System.out.println("----------------------------------------");
        System.out.println("Enter up to 10 quiz scores (0-100).");
        System.out.println("Enter 999 to stop early.");
        System.out.println("========================================");
    }

    public static void main(String[] args) {
        printSpecifications();

        Scanner input = new Scanner(System.in);

        int[] grades = new int[10];
        int count = 0;
        int total = 0;

        System.out.print("Enter a quiz score (0-100) or 999 to quit: ");
        int grade = input.nextInt();

        while (grade != 999 && count < grades.length) {
            grades[count] = grade;
            total += grade;
            count++;

            if (count < grades.length) {
                System.out.print("Enter a quiz score (0-100) or 999 to quit: ");
                grade = input.nextInt();
            }
        }

        System.out.println("\nGrades entered:");
        for (int i = 0; i < count; i++) {
            System.out.println("Grade " + (i + 1) + ": " + grades[i]);
        }

        input.close();
    }
}

//Step 5 — Compute the average quiz grade.
import java.util.Scanner;

public class QuizGradesApp {

    public static void printSpecifications() {
        System.out.println("========================================");
        System.out.println("Quiz Grades Application Specifications");
        System.out.println("----------------------------------------");
        System.out.println("Enter up to 10 quiz scores (0-100).");
        System.out.println("Enter 999 to stop early.");
        System.out.println("========================================");
    }

    public static void main(String[] args) {
        printSpecifications();

        Scanner input = new Scanner(System.in);

        int[] grades = new int[10];
        int count = 0;
        int total = 0;

        System.out.print("Enter a quiz score (0-100) or 999 to quit: ");
        int grade = input.nextInt();

        while (grade != 999 && count < grades.length) {
            grades[count] = grade;
            total += grade;
            count++;

            if (count < grades.length) {
                System.out.print("Enter a quiz score (0-100) or 999 to quit: ");
                grade = input.nextInt();
            }
        }

        System.out.println("\nGrades entered:");
        for (int i = 0; i < count; i++) {
            System.out.println("Grade " + (i + 1) + ": " + grades[i]);
        }

        double average = 0.0;
        if (count > 0) {
            average = (double) total / count;
        }

        System.out.printf("%nAverage score: %.2f%n", average);

        input.close();
    }
}

//Step 6 — Determine and display the letter grade for the average.
import java.util.Scanner;

public class QuizGradesApp {

    public static void printSpecifications() {
        System.out.println("========================================");
        System.out.println("Quiz Grades Application Specifications");
        System.out.println("----------------------------------------");
        System.out.println("Enter up to 10 quiz scores (0-100).");
        System.out.println("Enter 999 to stop early.");
        System.out.println("Computes average and letter grade.");
        System.out.println("========================================");
    }

    public static char letterGradeFor(double average) {
        if (average >= 90.0 && average <= 100.0) return 'A';
        if (average >= 80.0) return 'B';
        if (average >= 70.0) return 'C';
        if (average >= 60.0) return 'D';
        return 'F';
    }

    public static void main(String[] args) {
        printSpecifications();

        Scanner input = new Scanner(System.in);

        int[] grades = new int[10];
        int count = 0;
        int total = 0;

        System.out.print("Enter a quiz score (0-100) or 999 to quit: ");
        int grade = input.nextInt();

        while (grade != 999 && count < grades.length) {
            // (Optional but good practice) basic range check:
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid score. Enter a value from 0 to 100, or 999 to quit.");
            } else {
                grades[count] = grade;
                total += grade;
                count++;
            }

            if (count < grades.length) {
                System.out.print("Enter a quiz score (0-100) or 999 to quit: ");
                grade = input.nextInt();
            }
        }

        System.out.println("\nGrades entered:");
        for (int i = 0; i < count; i++) {
            System.out.println("Grade " + (i + 1) + ": " + grades[i]);
        }

        if (count == 0) {
            System.out.println("\nNo grades were entered. Average cannot be computed.");
        } else {
            double average = (double) total / count;
            char letter = letterGradeFor(average);

            System.out.printf("%nAverage score: %.2f%n", average);
            System.out.println("Letter grade: " + letter);
        }

        input.close();
    }
}