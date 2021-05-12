package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.MernisValidationService;
import kodlamaio.hrms.entities.abstracts.User;

public class MernisValidationManager implements MernisValidationService {

	@Override
	public void validate(User user) {
		System.out.println("Mernis doğrulaması yapıldı");
		
	}

}
