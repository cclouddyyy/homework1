public class Teacher {
    private String name;
    private Student[] students = new Student[3];
    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void displayStudentInfo() {
        System.out.println("Teacher: " + name);
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ": ");
            System.out.println("Name: " + students[i].getName());
            System.out.println("ID: " + students[i].getStudentId());
            System.out.println("Age: " + students[i].getAge());
        }
    }

}