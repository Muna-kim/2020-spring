package kr.green.springproject.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.springproject.dao.BoardDao;
import kr.green.springproject.vo.BoardVo;

@Service
public class BoardServiceImp implements BoardService {

	@Autowired
	private BoardDao boardDao;
	
	@Override
	public BoardVo getBoard(Integer num) {
		return boardDao.getBoard(num);
	}
//
	@Override
	public ArrayList<BoardVo> getBoardList() {
		return boardDao.getBoardList();
	}
	@Override
	public void updateBoard(BoardVo boardVo) {
		boardDao.updateBoard(boardVo);
		
	}
	@Override
	public void insertBoard(BoardVo boardVo) {
		boardDao.insertBoard(boardVo);
		
	}
	@Override
	public void deleteBoard(Integer num) {
		boardDao.deleteBoard(num);
		
	}

	
}
