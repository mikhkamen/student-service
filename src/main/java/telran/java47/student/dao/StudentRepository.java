package telran.java47.student.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import telran.java47.student.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
	Student save(Student student);
	
	Optional<Student> findById(Integer id);
	
	void deleteById(Integer id);
	
	List<Student> findAll();
}
