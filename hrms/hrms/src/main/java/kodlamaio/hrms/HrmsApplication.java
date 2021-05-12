package kodlamaio.hrms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.dataAccess.concretes.InMemoryAppUserDao;
import kodlamaio.hrms.dataAccess.concretes.InMemoryUserDao;
import kodlamaio.hrms.entities.concretes.ApplicantUser;

@SpringBootApplication
public class HrmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrmsApplication.class, args);

	}
}
