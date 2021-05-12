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
@Table(name = "employer")
public class EmployerUser extends User  {

	@Id
	@GeneratedValue

	@Column(name = "employerId")
	private int employerId;

	@Column(name = "companyName")
	private String companyName;

	@Column(name = "email")
	private String eMail;

	@Column(name = "website")
	private String websiteName;

	@Column(name = "phoneNumber")
	private String phoneNumber;

	@Column(name = "password")
	private String password;

	@Column(name = "isEmailVerified")
	private boolean isEmailVerified;

	@Column(name = "isHrmsVerified")
	private boolean isHrmsVerified;
}
