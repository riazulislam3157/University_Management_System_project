class Student extends Person {
    private int studentId;
    private double grade;

    public Student(String name, int age, int studentId, double grade) {
        super(name, age);
        this.studentId = studentId;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Grade: " + grade);
    }
}