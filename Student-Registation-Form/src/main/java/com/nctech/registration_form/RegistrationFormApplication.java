package com.nctech.registration_form;

import com.nctech.registration_form.controller.StudentController;
import com.nctech.registration_form.dto.Student;
import com.nctech.registration_form.service.impl.StudentServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegistrationFormApplication {

	public static void main(String[] args) {

		SpringApplication.run(RegistrationFormApplication.class, args);
		
	}

}
