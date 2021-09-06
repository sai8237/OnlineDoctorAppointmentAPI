package online.doctor.appointment.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Patient {

	@Id
	private String email;
	private String name;
	private String password;
	private String mobno;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	
	
}
