package kodlamaio.hrms.business.concretes;

import java.util.regex.Pattern;

import kodlamaio.hrms.business.abstracts.EmailValidationService;
import kodlamaio.hrms.entities.abstracts.User;

public class EmailValidationManager implements EmailValidationService {

	private static final String mailPattern = "^[A-Z0-9._+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)?$";
	private static Pattern pattern = Pattern.compile(mailPattern, Pattern.CASE_INSENSITIVE);

	@Override
	public void sendEmail(User user) {
		System.out.println("Aktivasyon Maili Gönderildi");

	}

	@Override
	public boolean isActivated(User user) {
		user.setEmailVerified(true);
		return true;
	}

	@Override
	public boolean isEmailValid(User user) {
		if (!user.getEmail().isEmpty()) {
			return pattern.matcher(user.getEmail()).find();
		}
		return false;

	}

}
