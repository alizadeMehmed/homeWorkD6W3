package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.abstracts.User;

public interface EmailValidationService {

	boolean isEmailValid(User user);
	
	void sendEmail(User user);
	
	boolean isActivated(User user);

}
