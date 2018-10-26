package AMV;

public class Classroom {
    private Teacher teacher;
    private Student[] students;
    Student[][] seatingChart = new Student[6][6];

    public Classroom(Teacher teacher, Student[] students)
    {
        this.teacher = teacher;
        this.students = students;
        fillSeats();
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

     public void fillSeats()
     {
         char aChar = Student;
         for (int row = 0; row < Encrypt.length; row++)
         {
             for (int column = 0; column < Encrypt[row].length; column++)
             {
                 Encrypt[row][column] = aChar;
             }
         }

     }
}
