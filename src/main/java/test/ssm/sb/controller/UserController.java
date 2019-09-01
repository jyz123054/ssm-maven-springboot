package test.ssm.sb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import test.ssm.sb.model.UserEntity;
import test.ssm.sb.service.UserServiceInter;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserServiceInter userServiceInter;
	
	@RequestMapping("/home")
	@ResponseBody
	public Object home() {
		log.info("/home");
		UserEntity u = userServiceInter.getUserInfo(1L);
		return u;
	}
	
}
