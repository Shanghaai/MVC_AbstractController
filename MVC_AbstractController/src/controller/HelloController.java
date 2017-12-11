package controller;

import java.util.HashMap;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController extends AbstractController {

	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {

		String Name = req.getParameter("name");
		
		Map m = new HashMap();
		m.put("msg", "Hello.....using simple url handler mappings : Abstract Controller "+Name);
		
		ModelAndView mav = new ModelAndView("success",m);
	
	return mav;

	}
}