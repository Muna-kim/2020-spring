package kr.green.springproject.service;

import java.util.ArrayList;

import kr.green.springproject.vo.BoardVo;

public interface BoardService {

	BoardVo getBoard(Integer num);

	ArrayList<BoardVo> getBoardList();

	void updateBoard(BoardVo boardVo);

	void insertBoard(BoardVo boardVo);

	void deleteBoard(Integer num);


}
