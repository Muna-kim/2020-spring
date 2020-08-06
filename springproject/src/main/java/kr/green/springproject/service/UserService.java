package kr.green.springproject.service;

import javax.servlet.http.HttpServletRequest;

import kr.green.springproject.vo.UserVo;

public interface UserService {

	void userSignup(UserVo userVo);

	UserVo userSignin(UserVo userVo);

	UserVo modifyUser(HttpServletRequest request);



}
