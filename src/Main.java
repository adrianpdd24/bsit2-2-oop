    public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Alice",20,"BSIT",85.0,90.0,88.0);
        Student s2 = new Student("Bob",19,"BSCS",92.0,95.0,89.0);
        Student s3 = new Student("Charlie",21,"BSIT",65.0,70.0,68.0);

        Student[] list = {s1,s2,s3};

        int passCount = 0;

        System.out.println("Student Information:");

        for (Student s : list) {
            s.displayInfo();
            double avg = s.calculateAverage();
            String grade = s.getLetterGrade();
            boolean pass = s.isPassing();

            System.out.println("                                                         ");
            System.out.printf("Average: %.2f\n", avg);
            System.out.println("Letter Grade: " + grade);
            System.out.println("Status: " + (pass ? "PASSING" : "FAILING"));
            System.out.println("                                                         ");

                if (pass) {
                    passCount++;
                }
            }

            System.out.println("                                                         ");
            System.out.println("Summary: " + passCount + " out of 3 students are passing.");
        }
    }



