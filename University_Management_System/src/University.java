import java.util.ArrayList;
import java.util.List;
class University implements Administrator{
    private List<Student> students;
    private Professor Professor ;

    public University()
    {
        students = new ArrayList<>();
    }

    public void admitStudent(Student student)
    {
        students.add(student);
        System.out.println("Student " + student.getName() + " admitted successfully.");
    }
    public void expelStudent(Student student)
    {
        if (students.remove(student))
        {
            System.out.println("Student " + student.getName() + " expelled successfully.");
        }
        else
        {
            System.out.println("Student " + student.getName() + " not found.");
        }
    }
    public void assignProfessor(Professor professor)
    {

    }

    public void assignTeacher(Professor Professor) {
        if (this.Professor == null) {
            this.Professor = Professor;
            System.out.println("Teacher " + Professor.getName() + " assigned successfully.");
        } else {
            System.out.println("Teacher already assigned.");
        }
    }

    public void displayStudents() {
        for (Student student : students) {
            student.displayInfo();
            System.out.println("---------------------");
        }
    }

    public void displayTeacher()
    {
        if (Professor != null)
        {
            Professor.displayInfo();
        }
        else
        {
            System.out.println("No teacher assigned yet.");
        }
    }
}