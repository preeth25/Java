public class Student {

    int id;
    String firstName;
    String lastName;
    double fees;

    public Student(int id, String firstName, String lastName, double fees) {
        this.id = id;
        this.firstName = firstName;
        this.fees = fees;
    }
    public void getId() {
        System.out.println("Student ID: " + id);
        
    }
    public String getName() {
        System.out.println("Name: " + firstName);
        return firstName ;
    }

    public double getFees() {
        System.out.println("Fees: " + fees);
        return fees;
    }

    public static void main(String[] args) {
       
        Student student1 = new Student(1, "John", "Doe", 1500.50);
        Student student2 = new Student(2, "Jane", "Smith", 2000.75);
        Student student3 = new Student(3, "Emily", "Johnson", 1800.00);

        student1.getId();
        student1.getName();
        student1.getFees();
        student2.getId();
        student2.getName();
        student2.getFees();
        student3.getId();
        student3.getName();
        student3.getFees();


    }
}
