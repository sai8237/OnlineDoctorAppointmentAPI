package online.doctor.appointment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

	@GetMapping("/home")
	public String doctorHome()
	{
		return "Welcome docter home";
	}
}
