package kr.green.springnew.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.springnew.dao.BoardDao;
import kr.green.springnew.vo.BoardVo;


@Service
public class BoardServiceImp implements BoardService {

	@Autowired
	BoardDao boardDao;
	
	@Override
	public ArrayList<BoardVo> getBoardList() {
		return boardDao.getBoardList();
	}

	@Override
	public BoardVo getBoard(Integer num) {
		return boardDao.getBoard(num);
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
	
//	@Override
//	public void deleteBoard(Integer num) {
//			boardDao.deleteBoard(num);
//	}

	
//	@Override
//	public void deleteBoard(Integer num) {
//		BoardVo boardVo =  boardDao.deleteBoard(num);
//		boardVo.setIsDel('Y');
//		boardDao.updateBoard(boardVo);
//	}

}
