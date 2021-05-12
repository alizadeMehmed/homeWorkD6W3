package kodlamaio.hrms.entities.abstracts;
import lombok.Data;

@Data
public abstract class User {
	private int id; 
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String nationalId;
	private boolean isEmailVerified;
	
}
