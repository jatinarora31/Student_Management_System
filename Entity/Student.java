package in.mainflow.sms.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Table(name="students")
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name= "grade")
	private String grade;
	
	@Column(name = "attendence")
	private String attendence;
	
	public Student() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getAttendence() {
		return attendence;
	}
	public void setAttendence(String attendence) {
		this.attendence = attendence;
	}
	public Student(int id,String name, String grade, String attendence) {
		super();
		this.id=id;
		this.name = name;
		this.grade = grade;
		this.attendence = attendence;
	}
	
	
	
	
	
}
