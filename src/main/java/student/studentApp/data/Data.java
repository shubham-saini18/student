package student.studentApp.data;

import org.springframework.data.jpa.repository.JpaRepository;

import student.studentApp.entity.Student;

public interface Data extends JpaRepository<Student , Integer> {

}
