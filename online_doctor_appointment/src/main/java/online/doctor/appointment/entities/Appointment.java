package online.doctor.appointment.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity(name="bookings")
@Table(name="appointment")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long  bookId;
	@Column
	private String doctorName;
	@Column
	private String patientName;
	@Column
	private String paymentStatus;
	@Column
	private String dateTime;
	
	
	public Appointment() {}
	
	public Appointment(Long bookId, String doctorName, String patientName, String paymentStatus, String dateTime) {
		super();
		this.bookId = bookId;
		this.doctorName = doctorName;
		this.patientName = patientName;
		this.paymentStatus = paymentStatus;
		this.dateTime = dateTime;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	
	
}
