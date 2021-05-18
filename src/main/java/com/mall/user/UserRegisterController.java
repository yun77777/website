package com.mall.user;

import java.util.Map;

import com.mall.board.web.boardController;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mall.login.service.loginService;


@Controller
@RequestMapping("/user")
public class UserRegisterController {

    @Resource(name = "UserService")
    private UserService userService;

    // 회원가입 페이지
    @RequestMapping(value = "/register.do", method = RequestMethod.GET)
    public String registerGET() throws Exception {
        return "/user/register";
    }

    // 회원가입 처리
    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    public String registerPOST(Map<String, Object> paramMap, UserVO userVO, RedirectAttributes redirectAttributes) throws Exception {
    	try {
    		System.err.println("$$$$:"+paramMap);
    		paramMap.put("ID",userVO.getID());
        	paramMap.put("PW",userVO.getPW());
        	
            String hashedPw = BCrypt.hashpw(userVO.getPW(), BCrypt.gensalt());
            userVO.setPW(hashedPw);
            userService.register(paramMap, userVO);
            redirectAttributes.addFlashAttribute("msg", "REGISTERED");
            
		} catch (Exception e) {
			e.printStackTrace();
		}
        return "redirect:/user/login.do";
    }
    
}