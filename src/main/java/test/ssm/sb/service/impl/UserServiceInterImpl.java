package test.ssm.sb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.ssm.sb.mapper.UserMapper;
import test.ssm.sb.model.UserEntity;
import test.ssm.sb.service.UserServiceInter;

@Service
public class UserServiceInterImpl implements UserServiceInter{
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public UserEntity getUserInfo(Long id) {
		return userMapper.getUserInfo(id);
	}

}
