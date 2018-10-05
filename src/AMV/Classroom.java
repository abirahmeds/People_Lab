package AMV;

public class Classroom {
    private Teacher teacher;
    private Student[] students;

    public Classroom(Teacher teacher, Student[] students)
    {
        this.teacher = teacher;
        this.students = students;
    }

    public String getSubject()
    {
        return this.teacher.getSubject();
    }

    public double classAverage()
    {
        int sum = 0;
        for(int i = 0; i < students.length; i++)
        {
            sum = sum + students[i].getGPA();
        }
        return (double) sum / students.length;
    }

    public void toString
}
