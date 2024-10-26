package in.mainflow.sms.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.mainflow.sms.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
	
	

}
