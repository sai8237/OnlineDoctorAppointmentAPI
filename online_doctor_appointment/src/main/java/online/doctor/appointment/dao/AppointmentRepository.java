package online.doctor.appointment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import online.doctor.appointment.entities.Appointment;
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Integer>{
//public Appointment findByDoctorName();
	
	@Query("SELECT ap FROM bookings ap where ap.doctorName=?1")
	public List<Appointment> findByDoctorName(String doctorName);
	
//public Appointment  findByPatientName();
	
	@Query("SELECT ap FROM bookings ap where ap.patientName=?1")
	public List<Appointment> findByPatientName(String patientName);
}
