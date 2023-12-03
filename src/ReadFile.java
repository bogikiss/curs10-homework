
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ReadFile {
    public static List<StudentGrade> readStudentGrades(String filename) throws FileNotFoundException {
        List<StudentGrade> studentGrades = new ArrayList<>();
        Scanner scan = new Scanner(new File("files", filename));
        while (scan.hasNext()) {
            String[] students = scan.nextLine().split(Pattern.quote("|"));
            studentGrades.add(new StudentGrade(students[0], students[1], Integer.parseInt(students[2])));
        }
        return studentGrades;
    }
}
