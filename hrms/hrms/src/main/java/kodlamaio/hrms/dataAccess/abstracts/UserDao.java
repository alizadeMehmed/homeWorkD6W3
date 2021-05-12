package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.abstracts.User;
import kodlamaio.hrms.entities.concretes.UserService;

public interface UserDao extends JpaRepository<UserService, Integer>{
	void add(User user);

	void update(User user);

	void delete(User user);

	boolean ifEmailExists(String email);

	boolean ifTcknExists(String tckNo);
}
