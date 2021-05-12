package kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "adresses")
public class Adresses {

	@Id
	@GeneratedValue

	@Column(name= "id")
	private int adressId;
	
	@Column(name= "userId")
	private int userId;
	
	@Column(name = "addressDetail")
	private String addressDetail;

	public Adresses(int adressId, String adressDetail) {
		super();
		this.adressId = adressId;
		this.addressDetail = adressDetail;
	}
}
