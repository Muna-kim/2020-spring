package kr.green.springnew.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.springnew.service.BoardService;
import kr.green.springnew.service.UserService;
import kr.green.springnew.vo.BoardVo;
import kr.green.springnew.vo.UserVo;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/board/list" , method=RequestMethod.GET)
	public ModelAndView boardListGet(ModelAndView mv) {
	    mv.setViewName("/board/list");
	    ArrayList<BoardVo> boardList = boardService.getBoardList();
	    mv.addObject("list",boardList);
	    return mv;
	}
	
	@RequestMapping(value="/board/detail" , method=RequestMethod.GET)
	public ModelAndView boardDetailGet(ModelAndView mv,Integer num) {
	    mv.setViewName("/board/detail");
	    BoardVo boardVo = null;
	    boardVo=boardService.getBoard(num);
	    mv.addObject("board",boardVo);
	    return mv;
	}
	
	@RequestMapping(value="/board/register" , method=RequestMethod.GET)
	public ModelAndView boardRegisterGet(ModelAndView mv) {
	    mv.setViewName("/board/register");
	    return mv;
	}
	
	@RequestMapping(value="/board/register" , method=RequestMethod.POST)
	public ModelAndView boardRegisterPost(ModelAndView mv,BoardVo boardVo) {
	    mv.setViewName("redirect:/board/list");
	    System.out.println(boardVo);
	    boardService.insertBoard(boardVo);
	    return mv;
	}
	
	@RequestMapping(value="/board/modify" , method=RequestMethod.GET)
	public ModelAndView boardModifyGet(ModelAndView mv,Integer num,HttpServletRequest request) {
	    BoardVo boardVo = null;
	    boardVo=boardService.getBoard(num);
	    //"board"는 jsp에서 쓸이름, boardVo는  service에서 쓸이름.
	    //mv.addObject가 없으면 board의 내용이 안보임. 
	    mv.addObject("board",boardVo);
	    UserVo user=userService.getUser2(request);
	    if(user == null || !boardVo.getWriter().equals(user.getId())) {
	    	mv.setViewName("redirect:/board/list");
	    }else {
	   	    mv.setViewName("/board/modify");
	    }
	    return mv;
	}
	
	@RequestMapping(value="/board/modify" , method=RequestMethod.POST)
	public ModelAndView boardModifyPost(ModelAndView mv,BoardVo boardVo,HttpServletRequest request) {
	    mv.setViewName("redirect:/board/list");
	    //아래 코드는 받을게 있을 때 쓰는 코드
	    //boardVo boardVo=BoardService.updateBoard(boardVo)
	    //주기만하고 받을게 없을 때 쓰는 코드(수정할때)
	    //boardService.updateBoard(boardVo);
	    boardService.updateBoard(boardVo);
	    System.out.println(boardVo);
	    
	    
	    return mv;
	}
	@RequestMapping(value="/board/delete" , method=RequestMethod.GET)
	public ModelAndView boardDeleteGet(ModelAndView mv,Integer num) {
	    mv.setViewName("redirect:/board/list");
	    boardService.deleteBoard(num);
	    
	    return mv;
	}
	
	
	
//	@RequestMapping(value="/board/delete" , method=RequestMethod.GET)
//	public ModelAndView boardDeleteGet(ModelAndView mv,Integer num) {
//	    mv.setViewName("/board/delete");
//	    BoardVo boardVo = null;
//	    boardVo=boardService.getBoard(num);
//	    mv.addObject("board",boardVo);
//	    System.out.println(boardVo);
//	    return mv;
//	}
	
//	@RequestMapping(value="/board/delete" , method=RequestMethod.POST)
//	public ModelAndView boardDeletePost(ModelAndView mv,BoardVo boardVo,Integer num) {
//	    mv.setViewName("redirect:/board/list");
//	    System.out.println(boardVo);
//	    boardService.deleteBoard(num);
//	    System.out.println(boardVo);
//	    return mv;
//	}
	
}
