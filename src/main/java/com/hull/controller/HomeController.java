package com.hull.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller  
public class HomeController {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping(value = "/home")  
    public ModelAndView home(@RequestParam(defaultValue="world") String name,Model m){
		logger.info("home ==============="+name);
        m.addAttribute("text", "hello "+name);
        return new ModelAndView("home");  
    }
	
	@RequestMapping(value = "/home2")  
    public String home2(@RequestParam(defaultValue="world") String name,Model m){
		logger.info("home ==============="+name);
        m.addAttribute("text", "hello "+name);
        return "home";  
    }
	
	@RequestMapping("/do")  
	@ResponseBody
	String artificial(String serviceName) {  
		logger.info("serviceName=========="+serviceName);
		
		return "success!";  
	}  
	
}
