import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Classroom {
    List<StudentGrade> studentGrades = new ArrayList<>();

    public Classroom(List<StudentGrade> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public List<StudentGrade> getStudentGrades() {
        return studentGrades;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        if (discipline == null || discipline.isBlank()) {
            return new ArrayList<>();
        }
        List<Integer> gradesForDiscipline = new ArrayList<>();
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getDiscipline().equals(discipline)) {
                gradesForDiscipline.add(studentGrade.getGrade());
            }
        }
        return gradesForDiscipline;
    }

    public List<Integer> getGradesForStudent(String student) {
        if (student == null || student.isBlank()) {
            return new ArrayList<>();
        }
        List<Integer> gradesForStudent = new ArrayList<>();
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getName().equals(student)) {
                gradesForStudent.add(studentGrade.getGrade());
            }
        }
        return gradesForStudent;
    }

    public StudentGrade getMaxGrade(String discipline) {
        StudentGrade maxGrade = null;
        if (discipline == null || discipline.isBlank()) {
            return null;
        }
        List<Integer> gradesForDiscipline = getGradesForDiscipline(discipline);
        Collections.sort(gradesForDiscipline);
        Collections.reverse(gradesForDiscipline);
        int max = gradesForDiscipline.get(0);
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getGrade().equals(max) && studentGrade.getDiscipline().equals(discipline)) {
                maxGrade = studentGrade;
            }
        }
        return maxGrade;
    }

    public StudentGrade getMaxGrade() {
        StudentGrade maxGrade = null;
        List<Integer> grades = getGrades();
        Collections.sort(grades);
        Collections.reverse(grades);
        int max = grades.get(0);
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getGrade().equals(max)) {
                maxGrade = studentGrade;
            }
        }
        return maxGrade;
    }

    public List<Integer> getGrades() {
        List<Integer> grades = new ArrayList<>();
        for (StudentGrade studentGrade : studentGrades) {
            grades.add(studentGrade.getGrade());
        }
        return grades;
    }

    public StudentGrade getWorstGrade(String discipline) {
        StudentGrade minGrade = null;
        if (discipline == null || discipline.isBlank()) {
            return null;
        }
        List<Integer> gradesForDiscipline = getGradesForDiscipline(discipline);
        Collections.sort(gradesForDiscipline);
        int min = gradesForDiscipline.get(0);
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getGrade().equals(min) && studentGrade.getDiscipline().equals(discipline)) {
                minGrade = studentGrade;
            }
        }
        return minGrade;
    }

    public Integer getAverageGrade(String discipline){
        Integer averageGrade = 0;
        if (discipline == null || discipline.isBlank()) {
            return null;
        }
        List<Integer> gradesForDiscipline = getGradesForDiscipline(discipline);
        Integer numOfGrades = gradesForDiscipline.size();
        Integer sumOfGrades = 0;
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getDiscipline().equals(discipline)) {
                sumOfGrades += studentGrade.getGrade();
            }
        }
        averageGrade = sumOfGrades / numOfGrades;
        return averageGrade;
    }

    public StudentGrade getWorstGrade() {
        StudentGrade minGrade = null;
        List<Integer> grades = getGrades();
        Collections.sort(grades);
        int min = grades.get(0);
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getGrade().equals(min)) {
                minGrade = studentGrade;
            }
        }
        return minGrade;
    }

    public Integer getAverageGrade(){
        Integer averageGrade = 0;
        List<Integer> grades = getGrades();
        Integer numOfGrades = grades.size();
        Integer sumOfGrades = 0;
        for (StudentGrade studentGrade : studentGrades) {
            sumOfGrades += studentGrade.getGrade();
        }
        averageGrade = sumOfGrades / numOfGrades;
        return averageGrade;
    }
}
