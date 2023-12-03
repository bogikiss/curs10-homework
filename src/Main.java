import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<StudentGrade> studentGrades = ReadFile.readStudentGrades("grades (1).txt");
        System.out.println(studentGrades);
        Classroom classroom = new Classroom(studentGrades);
        System.out.println(classroom.getGradesForDiscipline("Mathematics"));
        System.out.println(classroom.getGradesForStudent("Utu Arcadius"));
        System.out.println(classroom.getMaxGrade("Mathematics"));
        System.out.println(classroom.getGrades());
        System.out.println(classroom.getMaxGrade());
        System.out.println(classroom.getWorstGrade("Mathematics"));
        System.out.println(classroom.getAverageGrade("Mathematics"));
        System.out.println(classroom.getWorstGrade());
        System.out.println(classroom.getAverageGrade());

        ReportGenerator reportGenerator = new ReportGenerator(classroom);
        reportGenerator.generateReport();
    }
}