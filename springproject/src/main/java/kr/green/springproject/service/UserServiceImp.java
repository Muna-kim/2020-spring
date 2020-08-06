package kr.green.springproject.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.green.springproject.dao.UserDao;
import kr.green.springproject.vo.UserVo;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	UserDao userDao;
	
	@Autowired
	 BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public void userSignup(UserVo userVo) {
		String encPw = passwordEncoder.encode(userVo.getPw());
		userVo.setPw(encPw);
		userDao.userSignup(userVo);
		
	}

	@Override
	public UserVo userSignin(UserVo userVo) {
		UserVo user =userDao.getUser(userVo.getId());
		if(user == null) {
			return null;
		}
		if(user.getPw().equals(userVo.getPw())) {
			return user;
		}
		return null;
	}

	@Override
	public UserVo modifyUser(HttpServletRequest request) {
		return (UserVo)request.getSession().getAttribute("user");
	}



}
