package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.User;
import kodlamaio.hrms.entities.abstracts.UserEntity;
import lombok.Data;

@Data
@Entity
@Table(name = "applicant")
public class ApplicantUser extends User {

	@Id
	@GeneratedValue

	@Column(name = "applicantId")
	private int applicantId;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "TcKimlikNo")
	private String nationalId;

	@Column(name = "birthYear")
	private int birthYear;

	@Column(name = "password")
	private String password;

	@Column(name = "email")
	private String email;
	
	@Column(name = "jobTitleId")
	private int jobTitleId;
	
	@Column(name = "isVerified")
	private boolean isVerified;
	
	@Column(name = "isEmailVerified")
	private boolean isEmailVerified;
	
	private String passRepeat;
}
