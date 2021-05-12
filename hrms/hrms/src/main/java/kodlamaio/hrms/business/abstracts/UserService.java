package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.abstracts.User;

public interface UserService {
	void add(User user);

	void delete(User user);

	void update(User user);
}
