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
@Table(name = "systemUser")
public class SystemUser extends User {

	@Id
	@GeneratedValue

	@Column(name = "systemUserId")
	private int systemUserId;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "birthYear")
	private int BirthYear;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "tcKimlikNo")
	private String nationalId;
	
	public SystemUser(int id, int userId, String adressDetail, int systemUserId, String firstName, String lastName,
			String nationalId, int birthYear, String password) {
		super();
		this.systemUserId = systemUserId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		BirthYear = birthYear;
		this.password = password;
	}

}
