package telran.java47.student.service;

import java.util.List;

import telran.java47.student.dto.ScoreDto;
import telran.java47.student.dto.StudentCreateDto;
import telran.java47.student.dto.StudentDto;
import telran.java47.student.dto.StudentUpdateDto;

public interface StudentService {
	boolean addStudent(StudentCreateDto studentCreateDto);
	
	StudentDto findStudent(Integer id);
	
	StudentDto removeStudent(Integer id);
	
	StudentCreateDto updateStudent(Integer id, StudentUpdateDto studentUpdateDto);
	
	boolean addScore(Integer id, ScoreDto scoreDto);
	
	List<StudentDto> findStudentsByName(String name);
	
	long getStudentsNamesQuantity(List<String> names);
	
	List<StudentDto> getStudentsByExamMinScore(String exam, int minScore);
}
