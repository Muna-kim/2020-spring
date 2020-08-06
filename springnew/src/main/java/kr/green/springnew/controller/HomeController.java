package kr.green.springnew.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.springnew.service.UserService;
import kr.green.springnew.vo.UserVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value= "/" , method=RequestMethod.GET)
	public ModelAndView openTilesView(ModelAndView mv) {
	    mv.setViewName("/main/home");
	    return mv;
	}

    @RequestMapping(value="/user/signup" , method=RequestMethod.GET)
    public ModelAndView userSignupGet(ModelAndView mv) {
        mv.setViewName("/main/signup");
        return mv;
    }
    
    @RequestMapping(value="/user/signup" , method=RequestMethod.POST)
    public ModelAndView userSignupPost(ModelAndView mv,UserVo userVo) {
        mv.setViewName("redirect:/");
        System.out.println(userVo);
        userService.userSignup(userVo);
        return mv;
    }
    
    
    @RequestMapping(value="/user/signin" , method=RequestMethod.GET)
    public ModelAndView userSigninGet(ModelAndView mv) {
        mv.setViewName("/main/signin");
        return mv;
    }
    
    @RequestMapping(value="/user/signin" , method=RequestMethod.POST)
    public ModelAndView userSigninPost(ModelAndView mv,UserVo userVo) {
        System.out.println(userVo);
        UserVo user = userService.userSignin(userVo);
        if(user!=null) {
        	mv.setViewName("redirect:/board/list");
        	mv.addObject("user",user);
        }
        else {
        	mv.setViewName("redirect:/");
        }
        return mv;
    }
    
    @RequestMapping(value="/user/signout" , method=RequestMethod.GET)
    public ModelAndView userSignoutGet(ModelAndView mv,HttpServletRequest request) {
        mv.setViewName("redirect:/");
        request.getSession().removeAttribute("user");
        return mv;
    }

}
