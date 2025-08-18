public class GradeCalculator {


    public double calculateAverage(double... grades) {
        if (grades.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }


    public String getLetterGrade(double average) {
        if (average >= 90 && average <= 100) {
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


    public void displayResult(String studentName, double average) {
        System.out.printf("Student: %s, Average: %.1f%n", studentName, average);
    }


    public void displayResult(String studentName, double average, String letterGrade) {
        System.out.printf("Student: %s, Average: %.1f, Grade: %s%n", studentName, average, letterGrade);
    }


    public static void main(String[] args) {
        GradeCalculator gradeCalc = new GradeCalculator();


        String student = "John Smith";
        double average = gradeCalc.calculateAverage(85.5, 92.0, 78.5, 90.0);
        String letterGrade = gradeCalc.getLetterGrade(average);


        gradeCalc.displayResult(student, average);
        gradeCalc.displayResult(student, average, letterGrade);
    }
}
