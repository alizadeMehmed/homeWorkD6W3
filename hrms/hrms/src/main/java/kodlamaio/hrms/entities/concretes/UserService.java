package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "jobTitles")
public class UserService {

	@Id
	@GeneratedValue

	@Column(name = "titleid")
	private int titleId;

	@Column(name = "titleName")
	private String titleName;

//	public JobTitles(String titleName) {
//		super();
//		this.titleName = titleName;
//	}
}
