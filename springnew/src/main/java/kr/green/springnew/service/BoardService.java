package kr.green.springnew.service;

import java.util.ArrayList;

import kr.green.springnew.vo.BoardVo;

public interface BoardService {

	ArrayList<BoardVo> getBoardList();

	BoardVo getBoard(Integer num);

	void updateBoard(BoardVo boardVo);

	void insertBoard(BoardVo boardVo);

	void deleteBoard(Integer num);

//	void deleteBoard(Integer num);


}
