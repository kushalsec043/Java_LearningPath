package Springhomepage;

import org.springframework.web.bind.annotation.RequestMapping;




public class homepage 
{
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
}
