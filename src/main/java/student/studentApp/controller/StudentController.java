package student.studentApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import student.studentApp.entity.Student;
import student.studentApp.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService s;

	@GetMapping("/student")
	public List<Student> getStudentList() {
		return this.s.getStudent();
	}

	@PostMapping("/student")
	public Student addNewStudent(@RequestBody Student student) {
		return this.s.addStudent(student);

	}

	@DeleteMapping("/student{id}")
	public ResponseEntity<HttpStatus> deleteStudentData(@PathVariable int id) {
		try {
			this.s.deleteStudentData(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
