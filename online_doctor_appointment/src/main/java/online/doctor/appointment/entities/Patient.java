package online.doctor.appointment.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="pats")
@Table(name="patient")
public class Patient {

	@Id
	private String email;
	@Column
	private String name;
	@Column
	private String password;
	@Column
	private String mobno;
	public Patient() {}
	public Patient(String email, String name, String password, String mobno) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.mobno = mobno;
	}
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
