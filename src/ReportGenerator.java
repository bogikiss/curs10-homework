import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReportGenerator {
    Classroom grades;
    ReportGenerator(Classroom grades){
        this.grades = grades;
    }

    public void generateReport() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("files/grade-reports.out"));
        writer.write("Cea mai mare nota: " + grades.getMaxGrade().getName() + " " + grades.getMaxGrade().getGrade());
        writer.newLine();
        writer.write("Nota medie: " + grades.getAverageGrade());
        writer.newLine();
        writer.write("Cea mai mica nota: " + grades.getWorstGrade().getName() + " " + grades.getWorstGrade().getGrade());
        writer.close();
    }
}
