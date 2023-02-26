public class University {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Teacher 1");
        Teacher teacher2 = new Teacher("Teacher 2");
        Teacher teacher3 = new Teacher("Teacher 3");

        Student student1 = new Student("Student 1", 228777, 14);
        Student student2 = new Student("Student 2", 880055, 19);
        Student student3 = new Student("Student 3", 353500, 18);
        Student student4 = new Student("Student 4", 666666, 18);
        Student student5 = new Student("Student 5", 100070, 15);
        Student student6 = new Student("Student 6", 696969, 16);

        teacher1.setStudents(new Student[]{student1, student2, student3});
        teacher2.setStudents(new Student[]{student4, student5, student6});
        teacher3.setStudents(new Student[]{student1, student4, student6});

        System.out.println("Teacher 1: ");
        teacher1.displayStudentInfo();
        System.out.println("\nTeacher 2: ");
        teacher2.displayStudentInfo();
        System.out.println("\nTeacher 3: ");
        teacher3.displayStudentInfo();
    }
}