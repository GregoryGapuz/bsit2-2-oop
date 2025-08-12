public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Greg Gapuz", 20, "OOP", 80, 75, 80);
        Student s2 = new Student("Karl Veluz", 19, "PUR-COM", 85, 70, 85);
        Student s3 = new Student("Kenny Omega", 18, "STS", 70, 65, 68);

        Student[] students = {s1, s2, s3};
        int passingCount = 0;

        for (Student s : students) {
            s.displayInfo();
            double avg = s.calculateAverage();
            System.out.printf("Average: %.2f\n", avg);
            String letter = s.getLetterGrade();
            System.out.println("Letter Grade: " + letter);
            boolean passing = s.isPassing();
            System.out.println("Status: " + (passing ? "PASSING" : "FAILING"));
            System.out.println();
            if (passing) passingCount++;
        }

        System.out.println("Summary: Total number of students who are passing: " + passingCount);
    }
}
