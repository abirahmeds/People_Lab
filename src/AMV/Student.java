package AMV;

public class Student {
    private double GPA;
    private String club;
    private int grade;

    public Student(double GPA, String club, int grade)
    {
        this.GPA = GPA;
        this.club = club;
        this.grade = grade;

    }
    public double getGPA()
    {
        double GPA = Math.random()*100;
        return GPA;
    }
    public String toString()
    {
        return this.getfamilyName() + " ," + this.getfirstNames;
    }
