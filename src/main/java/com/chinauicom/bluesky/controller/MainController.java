package com.chinauicom.bluesky.controller;

import com.chinauicom.bluesky.domain.pojo.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * 主控制器 - 示例
 *
 * @author zhouwb15
 */
@Controller
public class MainController {

	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	/**
	 * 跳转示例
	 * @param session
	 * @return
	 */
	@RequestMapping("/home")
	public ModelAndView index(HttpSession session){
		Object sessionVar = session.getAttribute("var");
		if (sessionVar == null) {
			sessionVar = new Date();
			session.setAttribute("var", sessionVar);
		}
		ModelMap model = new ModelMap("message", Message.MESSAGE)

						.addAttribute("sessionVar", sessionVar);
		return new ModelAndView("forward:index.html", model);
	}

	/**
	 *  thymeLeaf 示例
	 * @param name
	 * @param model
	 * @return
	 */
	@RequestMapping("/hello")
	public String  hello(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model){
		model.addAttribute("name", name);
		return "hello";
	}

	/**
	 *  重定向示例
	 * @return
	 */
	@RequestMapping("/login")
	public String login(){
		return "login";
	}

	/**
	 *  上传文件
	 * @return
	 */
	@RequestMapping(value="/upload",method = RequestMethod.POST)
	@ResponseBody
	public String upload(MultipartFile file){
        String filename = file.getOriginalFilename();
		//TODO  FileUtil.writeFile(new File(filename))
		return "success";
	}

}
