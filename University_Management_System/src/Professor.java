class Professor extends Person {
    private int teacherId;
    private String subject;

    public Professor(String name, int age, int teacherId, String subject)
    {
        super(name, age);
        this.teacherId = teacherId;
        this.subject = subject;
    }

    public int getTeacherId()
    {
        return teacherId;
    }

    public String getSubject()
    {
        return subject;
    }
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Subject: " + subject);
    }
}