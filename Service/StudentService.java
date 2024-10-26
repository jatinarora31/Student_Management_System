package in.mainflow.sms.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import in.mainflow.sms.entity.Student;

import in.mainflow.sms.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	public List<Student> listAll() {
		return repo.findAll();
	}
	
	public void save(Student std) {
		repo.save(std);
	}
	
	public Student get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete (long id) {
		repo.deleteById(id);
	}
}
