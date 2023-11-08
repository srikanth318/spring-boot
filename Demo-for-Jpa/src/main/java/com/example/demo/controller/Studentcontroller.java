package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;

@RestController
@RequestMapping("/api")
public class Studentcontroller {

	@Autowired
	private StudentRepo studentRepo;

	// fetching AllStudents data
	@GetMapping("/getAllStudents")
	public ResponseEntity<Student> getAllData() {
		List<Student> findAll = studentRepo.findAll();
		return new ResponseEntity(findAll, HttpStatus.OK);
	}
	
	// fetching ByStudent data
	@GetMapping("/getByStudent/{name}")
	public ResponseEntity<Student> getByStudent(@PathVariable String name) {
		
		Student stdObj = studentRepo.findByName(name);
		return new ResponseEntity(stdObj, HttpStatus.OK);
	}
	
	
	// saving student data
	@PostMapping("/saveStudents")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {

		Student save = studentRepo.save(student);

		return new ResponseEntity<>(save, HttpStatus.CREATED);

	}

	// updating student data
	@PutMapping("/updateStudent/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable long id, @RequestBody Student stud) {

		Optional<Student> oldStudent = studentRepo.findById(id);

		if (oldStudent.isPresent()) {
			Student updateStudent = oldStudent.get();
			updateStudent.setStudentName(stud.getStudentName());
			updateStudent.setStudentEmail(stud.getStudentEmail());
			updateStudent.setStudentAddress(stud.getStudentAddress());
			Student studentObj = studentRepo.save(updateStudent);
			
			return new ResponseEntity<>(studentObj, HttpStatus.OK);
		}

		return new ResponseEntity("User id is not found with given id " + id, HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/deleteStudent/{id}")
	public ResponseEntity<Student> deleteStudent(@PathVariable long id) {

		Optional<Student> student = studentRepo.findById(id);
		
		if (student.isPresent()) 
		{
			studentRepo.delete(student.get());
			return new ResponseEntity("Student data deleted.." + id, HttpStatus.OK);
		}

		return new ResponseEntity("No data found with given id :: " + id, HttpStatus.NOT_FOUND);
	}

}
