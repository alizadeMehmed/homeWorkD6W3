package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.business.abstracts.EmailValidationService;
import kodlamaio.hrms.dataAccess.concretes.InMemoryUserDao;
import kodlamaio.hrms.entities.abstracts.User;
import kodlamaio.hrms.entities.concretes.ApplicantUser;

public class ApplicantUserManager extends UserManager implements UserService {

	private EmailValidationService validationService;
	private InMemoryUserDao inMemoryUserDao;

	public ApplicantUserManager(EmailValidationService validationService,InMemoryUserDao inMemoryUserDao) {
		super();
		this.validationService = validationService;
		this.inMemoryUserDao = inMemoryUserDao;
	}

	public void add(ApplicantUser appuser) {
		if (isFilled(appuser)) {
			System.out.println("Lütfen boş alanları doldurunuz");
			return;
		}
		
		if (this.validationService.isEmailValid(appuser) == false) { 
	
		System.out.println("Geçersiz eposta girdiniz" + appuser.getFirstName());
		
		}
		
		if (this.inMemoryUserDao.ifEmailExists(appuser.getEmail())) {
		System.out.println("Sistemde var olan bir eposta girdiniz " + appuser.getEmail());	
		}
		
		
	}

	public boolean isFilled(ApplicantUser appuser) {
		if (appuser.getFirstName().isEmpty() || appuser.getLastName().isEmpty() || appuser.getNationalId().isEmpty()
				|| appuser.getEmail().isEmpty() || appuser.getEmail().isEmpty() || appuser.getPassword().isEmpty()
				|| appuser.getPassRepeat().isEmpty()) {
			return true;
		}
		return false;

	}
}
