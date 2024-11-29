import java.util.Scanner;
public class Grades{
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter your marks ");
    int marks =scanner.nextInt();
    if (marks > 80 && marks <= 100) {
        System.out.println("Grade: A");
    } else if (marks > 60 && marks <= 80) {
        System.out.println("Grade: B");
    } else if (marks > 45 && marks <= 60) {
        System.out.println("Grade: C");
    } else if (marks > 38 && marks <= 45) {
        System.out.println("Grade: D");
    } else if (marks >= 0 && marks <= 38) {
        System.out.println("Grade: E");
    } else {
        System.out.println("Enter valid marks (0-100).");
    }

    scanner.close();
}
}