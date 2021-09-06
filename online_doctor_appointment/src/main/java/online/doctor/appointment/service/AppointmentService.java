package online.doctor.appointment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import online.doctor.appointment.dao.AppointmentRepository;
import online.doctor.appointment.entities.Appointment;

@Service
public class AppointmentService{

	@Autowired
	private AppointmentRepository appointmentRep;
	
	public String addAppointment(Appointment appointment) {
		appointmentRep.save(appointment);
		return "New appointment is booked for "+appointment.getPatientName()+" with doctor "+appointment.getDoctorName();
	}

	public Appointment getAppointment(int bookId) {
		return appointmentRep.findById(bookId).get();
	};
	
	public List<Appointment> getAppointmentsByDocName(String docName){
		return appointmentRep.findByDoctorName(docName);
	};
	
	public List<Appointment> getAppointmentsByPatientName(String patientName){
		return appointmentRep.findByPatientName(patientName);
	}

	
}
