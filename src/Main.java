public class Main {
    public static void main(String[] args) {
        GradeCalculator gradeCalc = new GradeCalculator();


        String student = "John Smith";
        double average = gradeCalc.calculateAverage(85.5, 92.0, 78.5, 90.0);
        String letterGrade = gradeCalc.getLetterGrade(average);


        gradeCalc.displayResult(student, average);
        gradeCalc.displayResult(student, average, letterGrade);
    }
}
