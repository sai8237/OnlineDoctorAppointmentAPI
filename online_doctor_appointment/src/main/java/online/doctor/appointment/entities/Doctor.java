package online.doctor.appointment.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="docs")
@Table(name="doctor")
public class Doctor {

	@Id
	private String email;
	@Column
	private String name;
	@Column
	private String category;
	@Column
	private  int  fee;
	@Column
	private String password;
	@Column
	private String mobno;
	
	public Doctor(){}
	
	public Doctor(String email, String name, String category, int fee, String password, String mobno) {
		super();
		this.email = email;
		this.name = name;
		this.category = category;
		this.fee = fee;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
