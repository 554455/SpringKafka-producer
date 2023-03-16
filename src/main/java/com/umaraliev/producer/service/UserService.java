package com.umaraliev.producer.service;

import com.umaraliev.producer.dto.UserRegistrationDto;
import com.umaraliev.producer.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

	User save(UserRegistrationDto userRegistrationDto);

	List<User> getAll();
}
