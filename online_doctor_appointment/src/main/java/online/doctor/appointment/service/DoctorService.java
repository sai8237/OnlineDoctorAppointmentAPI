package online.doctor.appointment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import online.doctor.appointment.dao.DoctorRepository;
import online.doctor.appointment.entities.Doctor;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository doctorRep;
	
	public String addDoctor(Doctor doctor) {
		doctorRep.save(doctor);
		return doctor.getName()+" registered as Doctor";
	}
	
	public Doctor getDoctor(String email) {
		return doctorRep.findById(email).get();
	}
	
	public List<Doctor> getDoctorsByCategory(String category){
		return doctorRep.findByCategory(category);
	}
	
}
