package kr.green.springproject.dao;

import org.apache.ibatis.annotations.Param;

import kr.green.springproject.vo.UserVo;

public interface UserDao {

	void userSignup(@Param("user")UserVo userVo);

	UserVo getUser(@Param("id")String id);


}
