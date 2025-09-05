
public class GradeCalculator {

    public static double calculateAverage(double score1, double score2) {
        return (score1 + score2) / 2;
    }

    public static String determineGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void printStudentInfo(String name, double average) {
        System.out.println("Student: " + name + ", Average: " + average);
    }

    public static void printStudentInfo(String name, double average, String grade) {
        System.out.println("Student: " + name + ", Average: " + average + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        String studentName = "John Smith";
        double score1 = 85.0;
        double score2 = 88.0;

        double average = calculateAverage(score1, score2);
        String grade = determineGrade(average);

        printStudentInfo(studentName, average);
        printStudentInfo(studentName, average, grade);
    }
}
