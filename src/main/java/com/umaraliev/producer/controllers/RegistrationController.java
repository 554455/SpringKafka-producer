package com.umaraliev.producer.controllers;

import com.umaraliev.producer.dto.UserRegistrationDto;
import com.umaraliev.producer.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
@RequiredArgsConstructor
public class RegistrationController {

	private final UserService userService;

	KafkaTemplate<String, UserRegistrationDto> kafkaTemplate;

	private static final String TOPIC = "NewTopic";

	@PostMapping
	public ResponseEntity registerUserAccount(@RequestBody UserRegistrationDto registrationDto) {
		kafkaTemplate.send(TOPIC, registrationDto);
		userService.save(registrationDto);
		return new ResponseEntity(HttpStatus.OK);
	}
}
