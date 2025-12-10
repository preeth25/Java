import java.util.Scanner;
public class ArrofStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int num = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("First Name: ");
            String firstName = sc.next();
            System.out.print("Fees: ");
            double fees = sc.nextDouble();
            students[i] = new Student(id, firstName, fees);
        }
        System.out.println("\nStudent Details:");
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            student.getId();
            student.getName();
            student.getFees();
            System.out.println();
        }
        sc.close();
    }
}