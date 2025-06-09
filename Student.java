public class Student {
    private String studentId;
    private String fullName;
    private int age;
    private String grade;
    private String email;
 
    public Student(String studentId, String fullName, int age, String grade, String email) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.age = age;
        this.grade = grade;
        this.email = email;
    }
 
    // Getters and Setters
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
 
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
 
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
 
    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
 
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
 
    @Override
    public String toString() {
        return "ID: " + studentId + ", Name: " + fullName + ", Age: " + age + ", Grade: " + grade + ", Email: " + email;
    }
}