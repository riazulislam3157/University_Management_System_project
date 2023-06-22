public class Result extends Student implements Display{

    public Result(String name, int age, int studentId, double gpa){
        super(name, age, studentId, gpa);
    }
    double cgpa= getGrade();
    public static void th()throws RuntimeException{
        System.out.println("Fail");
    }


    @Override
    public void displayResult() throws RuntimeException{
        if(cgpa<2)
        {
            th();
        }
        else {
            System.out.println("Pass");
        }


    }

}