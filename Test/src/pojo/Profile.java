package pojo;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table 
@Entity
public class Profile {
	
	@Generated(value = { "" })
	int id;
	@Column
	String firstName;
	@Column
	String lastName;
	
	
	public Profile(Integer profileId) {
		this.id=profileId;
	}
}
