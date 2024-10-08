import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Gather student's information
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();

        // Input for number of units with validation
        int numberOfUnits;
        do {
            System.out.print("Enter Number of Units (1-10): ");
            numberOfUnits = scanner.nextInt();

            if (numberOfUnits > 10 || numberOfUnits < 1) {
                System.out.println("Error: The number of units must be between 1 and 10. Please try again.");
            }
        } while (numberOfUnits > 10 || numberOfUnits < 1); // Loop until a valid number of units is entered

        // Create an instance of the StudentEnrollment class
        StudentEnrollment student = new StudentEnrollment(studentName, course, courseCode, numberOfUnits);

        // Compute the total enrollment fee
        int totalFee = student.calculateEnrollmentFee();

        // Output: Display the student's name and total fee
        System.out.println("\n--- Enrollment Summary ---");
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Course: " + student.getCourse());
        System.out.println("Course Code: " + student.getCourseCode());
        System.out.println("Number of Units: " + student.getNumberOfUnits());
        System.out.println("Total Enrollment Fee: " + totalFee);

        // Payment: Ask for the payment amount
        System.out.print("\nEnter payment amount: ");
        int payment = scanner.nextInt();

        // Check payment status
        if (payment == totalFee) {
            System.out.println("Payment Status: Fully Paid");
        } else if (payment < totalFee) {
            System.out.println("Payment Status: Partial Payment");
            System.out.println("Amount Paid: " + payment);
            System.out.println("Remaining Balance: " + (totalFee - payment));
        } else {
            System.out.println("Payment exceeds the total fee. Please check the amount.");
        }

        scanner.close();
    }
}
