package kr.green.springnew.service;

import javax.servlet.http.HttpServletRequest;

import kr.green.springnew.vo.UserVo;

public interface UserService {

	void userSignup(UserVo userVo);

	UserVo userSignin(UserVo userVo);

	UserVo getUser2(HttpServletRequest request);

}
