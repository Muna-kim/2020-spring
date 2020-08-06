package kr.green.springnew.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.springnew.dao.UserDao;
import kr.green.springnew.vo.UserVo;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public void userSignup(UserVo userVo) {
		userDao.userSignup(userVo);
		
	}

	@Override
	public UserVo userSignin(UserVo userVo) {
		//id pw 정보를 userVo에서 받아다가, userVo안의 Id만 받아서,  getUser에 넣어서  userDao로 이동한다.
		UserVo user = userDao.getUser(userVo.getId());
//		signin할때의 userVo에서 넘겨간 id와, db속에 id가 같은걸  Mapper에서 찾음. 같은 id가 없다면 null값을 가져왔을거고, 같은 id가 있다면 그에 해당하는 회원정보를 모두 가져왔음. 
//		그래서 UserVo user의 값에 넣어둠
		if( user == null)
			return null;
		if(user.getPw().equals(userVo.getPw()))
			return user;
		return null;
		
//		
//		if(userDao.getUser(signinUserVo.getId()) == null)
//			return false;
//		if(signupUserVo.getPw().equals(userDao.getUser(signinUserVo.getId()).getPw()))
//			return true;
//		return false;
		
	}

	@Override
	public UserVo getUser2(HttpServletRequest request) {
		//(UserVo)는 형변환
		//세션에 저장된 user를 getAttribute를 통해 
		return (UserVo)request.getSession().getAttribute("user");
	}
}
