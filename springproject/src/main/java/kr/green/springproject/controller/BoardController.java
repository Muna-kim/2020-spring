package kr.green.springproject.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.springproject.service.BoardService;
import kr.green.springproject.service.UserService;
import kr.green.springproject.vo.BoardVo;
import kr.green.springproject.vo.UserVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	 @Autowired
	    BoardService boardService;
	 @Autowired
	 	UserService userService;
	 
	 
	 @RequestMapping(value= "/board/list" , method=RequestMethod.GET)
	 public ModelAndView boardListGet(ModelAndView mv) {
		 mv.setViewName("/board/list");
		 //컨트롤러는 서비스에게 게시글 조회를 요청해서 조회된 게시글을 서비스한테서 받아옴
		 ArrayList<BoardVo> boardList = boardService.getBoardList();
		 //받아온 게시글 리스트를 jsp에 list라는 이름으로 전달
		 //"list"는 list.jsp에서 쓸이름, boardList는 board.service에서 쓸 이름.
		 mv.addObject("list", boardList);
		 return mv;
	 }

	@RequestMapping(value= "/board/detail" , method=RequestMethod.GET)
	public ModelAndView boardDetailGet(ModelAndView mv,Integer num) {
	    mv.setViewName("/board/detail");
	    BoardVo boardVo=null;
	    boardVo=boardService.getBoard(num);
	    mv.addObject("board",boardVo);
	    return mv;
	}
	

	
	@RequestMapping(value= "/board/register" , method=RequestMethod.GET)
	public ModelAndView boardRegisterGet(ModelAndView mv) {
//	    if(user!=null) {
	    	mv.setViewName("/board/register");
//	    }
	    return mv;
	}
	
	@RequestMapping(value= "/board/register" , method=RequestMethod.POST)
	public ModelAndView boardRegisterPost(ModelAndView mv,BoardVo boardVo) {
	    mv.setViewName("redirect:/board/list");
	    System.out.println(boardVo);
	    boardService.insertBoard(boardVo);
	    return mv;
	}
	
	@RequestMapping(value= "/board/modify" , method=RequestMethod.GET)
	public ModelAndView boardModifyGet(ModelAndView mv,Integer num,HttpServletRequest request) {
		mv.setViewName("/board/modify");
		BoardVo boardVo=boardService.getBoard(num);
		mv.addObject("board",boardVo);
		UserVo user=userService.modifyUser(request);
		if(user==null || !boardVo.getWriter().equals(user.getId())){
			mv.setViewName("redirect:/board/list");
		}
	    return mv;
	}
	
	@RequestMapping(value= "/board/modify" , method=RequestMethod.POST)
	public ModelAndView boardModifyPost(ModelAndView mv,Integer num,BoardVo boardVo) {
		mv.setViewName("redirect:/board/list");
		System.out.println(boardVo);
		boardService.updateBoard(boardVo);
	    return mv;
	}
	@RequestMapping(value= "/board/delete" , method=RequestMethod.GET)
	public ModelAndView boardDeleteGet(ModelAndView mv,Integer num) {
	    mv.setViewName("redirect:/board/list");
	    boardService.deleteBoard(num);
	    return mv;
	}
	
}
