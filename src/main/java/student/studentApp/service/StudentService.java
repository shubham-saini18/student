package student.studentApp.service;

import java.util.List;
import student.studentApp.entity.Student;

public interface StudentService {
	public List<Student> getStudent();

	public Student addStudent(Student student);

	public void deleteStudentData(int id);
}
