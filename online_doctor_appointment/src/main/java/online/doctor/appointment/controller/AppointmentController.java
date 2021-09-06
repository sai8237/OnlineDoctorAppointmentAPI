package online.doctor.appointment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

	@GetMapping("/home")
	public String appointmentHome()
	{
		return "Welcome appointment home";
	}
}
