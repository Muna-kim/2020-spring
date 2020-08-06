package kr.green.springnew.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import kr.green.springnew.vo.BoardVo;

public interface BoardDao {

	ArrayList<BoardVo> getBoardList();

	BoardVo getBoard(Integer num);

	void updateBoard(@Param("board")BoardVo boardVo);

	void insertBoard(@Param("board")BoardVo boardVo);
	
	//Param안에 값은 mapper에서 쓸이름을 지정
	void deleteBoard(@Param("num")Integer num);

//	BoardVo deleteBoard(@Param("board")Integer num);

}
