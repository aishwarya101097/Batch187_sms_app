package edu.cjc.sms_app.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.cjc.sms_app.app.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{
	
	public List<Student> findAllByBatchNumber(String batchNumber);

}
