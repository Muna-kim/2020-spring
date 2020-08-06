package kr.green.springnew.dao;

import org.apache.ibatis.annotations.Param;

import kr.green.springnew.vo.UserVo;

public interface UserDao {

	void userSignup(@Param("user")UserVo userVo);

//	userServiceImp에서 받아온 getUser(안에 signin했을때 id만 있음)안의 id를 mapper에서 이용ㄴ
	UserVo getUser(@Param("id")String id);

}
