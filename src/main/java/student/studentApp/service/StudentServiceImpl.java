package student.studentApp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student.studentApp.data.Data;
import student.studentApp.entity.Student;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private Data data;

	public StudentServiceImpl() {

	}

	@Override
	public List<Student> getStudent() {

		return data.findAll();
	}

	@Override
	public Student addStudent(Student student) {
		data.save(student);
		return student;
	}

	@Override
	public void deleteStudentData(int id) {
		int e = id;
		data.deleteById(e);

	}

}
