public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
 
        // Add students
        studentService.addStudent(new Student("1000","Ravi",20,"A","ravi@example.com"));
        studentService.addStudent(new Student("1001","Tara",28,"B","tara@example.com"));
        studentService.addStudent(new Student("1002","John",18,"C","john@example.com"));
        studentService.addStudent(new Student("1003","Sara",35,"B","sara@example.com"));
 
        // View all students
        System.out.println("All Students:");
        for (Student s : studentService.getAllStudents()) {
            System.out.println(s);
        }
 
        // Get a student by ID
        System.out.println("\nStudent with ID 1003:");
        System.out.println(studentService.getStudentById("1003"));
 
        // Update a student
        studentService.updateStudent("1001", new Student("1001","Kiran",28,"D","kiran@example.com"));
        System.out.println("\nAfter update:");
        System.out.println(studentService.getStudentById("1001"));
 
        // Delete a student
        studentService.deleteStudent("1003");
        System.out.println("\nAfter deleting 1003, remaining students:");
        for (Student s : studentService.getAllStudents()) {
            System.out.println(s);
        }
    }
}
 