package sy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.UsersMapper;
import sy.model.Users;
import sy.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UsersMapper UsersMapper;
	
	@Override
	public Users findUserById(Long id) {
		
		Users selectByPrimaryKey = UsersMapper.selectByPrimaryKey(id);
		
		return selectByPrimaryKey;
	}

}
