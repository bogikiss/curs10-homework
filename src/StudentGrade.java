public class StudentGrade {
    private String name;
    private String discipline;
    private Integer grade;

    public StudentGrade(String name, String discipline, Integer grade) {
        this.name = name;
        this.discipline = discipline;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public Integer getGrade() {
        return grade;
    }

    public String toString() {
        return "Student name: %s, discipline: %s, grade: %s".formatted(name, discipline, grade);
    }
}
