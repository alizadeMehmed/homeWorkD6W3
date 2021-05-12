package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrms.entities.concretes.UserService;
import lombok.AllArgsConstructor;



@Service

public class JobTitleManager implements JobTitleService{

	@Autowired
	private JobTitleDao jobTitleDao;
	
	@Override
	public List<UserService> getAll() {
		return jobTitleDao.findAll();
		
	}

}
