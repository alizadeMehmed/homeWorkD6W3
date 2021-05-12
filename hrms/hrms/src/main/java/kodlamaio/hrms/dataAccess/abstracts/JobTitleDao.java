package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.UserService;

public interface JobTitleDao extends JpaRepository<UserService, Integer>{

}
