package sy.service;

import org.springframework.stereotype.Service;

import sy.model.Users;

public interface UserService {
	
	public Users findUserById(Long id);
	
}
