import javax.xml.transform.Result;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        try {
            University university = new University();

            Scanner input_1 = new Scanner(System.in);
            System.out.println("Enter your name :");
            String s_name_1 = input_1.nextLine();
            System.out.println("Enter your age :");
            int s_age_1 = input_1.nextInt();
            System.out.println("Enter your id :");
            int s_id_1 = input_1.nextInt();
            System.out.println("Enter your grade :");
            double s_grade_1 = input_1.nextDouble();

            Scanner input_2 = new Scanner(System.in);
            System.out.println("Enter your name :");
            String s_name_2 = input_2.nextLine();
            System.out.println("Enter your age :");
            int s_age_2 = input_2.nextInt();
            System.out.println("Enter your id :");
            int s_id_2 = input_2.nextInt();
            System.out.println("Enter your grade :");
            double s_grade_2 = input_2.nextDouble();

            Scanner input_3 = new Scanner(System.in);
            System.out.println("Enter your name :");
            String s_name_3 = input_3.nextLine();
            System.out.println("Enter your age :");
            int s_age_3 = input_3.nextInt();
            System.out.println("Enter your id :");
            int s_id_3 = input_3.nextInt();
            System.out.println("Enter your grade :");
            double s_grade_3 = input_3.nextDouble();

            Scanner input_4 = new Scanner(System.in);
            System.out.println("Enter your name :");
            String p_name_1 = input_4.nextLine();
            System.out.println("Enter your age :");
            int p_age_1 = input_4.nextInt();
            System.out.println("Enter your id :");
            int p_id_1 = input_4.nextInt();
            input_4.nextLine();
            System.out.println("Enter your subject :");
            String p_sub_1 = input_4.nextLine();

            Scanner input_5 = new Scanner(System.in);
            System.out.println("Enter your name :");
            String p_name_2 = input_5.nextLine();
            System.out.println("Enter your age :");
            int p_age_2 = input_5.nextInt();
            System.out.println("Enter your id :");
            int p_id_2 = input_5.nextInt();
            input_5.nextLine();
            System.out.println("Enter your subject :");
            String p_sub_2 = input_5.nextLine();


            Student student1 = new Student(s_name_1, s_age_1, s_id_1, s_grade_1);
            Student student2 = new Student(s_name_2, s_age_2, s_id_2, s_grade_2);
            Student student3 = new Student(s_name_3, s_age_3, s_id_3, s_grade_3);

            Professor professor1 = new Professor(p_name_1, p_age_1, p_id_1, p_sub_1);
            Professor professor2 = new Professor(p_name_2, p_age_2, p_id_2, p_sub_2);

            university.admitStudent(student1);
            university.admitStudent(student2);
            university.admitStudent(student3);

            university.assignTeacher(professor1);
            university.assignTeacher(professor2);

            university.displayStudents();
            university.displayTeacher();

            university.expelStudent(student2);

            university.displayStudents();
        }catch (RuntimeException e)
        {
            System.out.println("Something wrong");
        }finally {
            System.out.println("Thanks");
        }
    }
}