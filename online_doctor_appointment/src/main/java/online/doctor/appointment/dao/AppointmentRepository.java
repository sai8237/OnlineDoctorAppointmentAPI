package online.doctor.appointment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import online.doctor.appointment.entities.Appointment;
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Integer>{
//public Appointment findByDoctorName();
//public Appointment  findByPatientName();
	
}
