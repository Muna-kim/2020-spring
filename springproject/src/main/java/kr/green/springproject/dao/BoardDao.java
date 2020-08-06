package kr.green.springproject.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import kr.green.springproject.vo.BoardVo;

public interface BoardDao {

	BoardVo getBoard(@Param("num")Integer num);

	ArrayList<BoardVo> getBoardList();

	void updateBoard(@Param("board")BoardVo boardVo);

	void insertBoard(@Param("board")BoardVo boardVo);

	void deleteBoard(@Param("num")Integer num);

}
