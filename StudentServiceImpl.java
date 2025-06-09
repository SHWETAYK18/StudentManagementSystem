import java.util.*;


public class StudentServiceImpl implements StudentService {
    private Map<String, Student> studentMap = new HashMap<>();
 
    public void addStudent(Student student) {
        studentMap.put(student.getStudentId(), student);
    }
 
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentMap.values());
    }
 
    public Student getStudentById(String id) {
        return studentMap.get(id);
    }
 
    public void updateStudent(String id, Student updatedStudent) {
        if (studentMap.containsKey(id)) {
            studentMap.put(id, updatedStudent);
        }
    }
 
    public void deleteStudent(String id) {
        studentMap.remove(id);
    }
}