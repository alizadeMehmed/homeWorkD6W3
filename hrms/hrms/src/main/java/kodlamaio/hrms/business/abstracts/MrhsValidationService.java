package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.abstracts.User;

public interface MrhsValidationService {
     void validate(User user);
     
     void reject(User user);
}
