// Class StudentEnrollment
public class StudentEnrollment {
    private String studentName;
    private String course;
    private String courseCode;
    private int numberOfUnits;
    private final int FEE_PER_UNIT = 1000; // Fixed fee per unit

    // Constructor to initialize student data
    public StudentEnrollment(String studentName, String course, String courseCode, int numberOfUnits) {
        this.studentName = studentName;
        this.course = course;
        this.courseCode = courseCode;
        this.numberOfUnits = numberOfUnits;
    }

    // Method to calculate the total enrollment fee
    public int calculateEnrollmentFee() {
        return numberOfUnits * FEE_PER_UNIT;
    }

    // Getters for student's information
    public String getStudentName() {
        return studentName;
    }

    public String getCourse() {
        return course;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getNumberOfUnits() {
        return numberOfUnits;
    }
}
