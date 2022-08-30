package s22palvelin.endpoints.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class endpointsController {

	@RequestMapping("index")
	@ResponseBody
	public String index() {
		return "This is the main page";
	}

	@RequestMapping("contact")
	@ResponseBody
	public String contact() {
		return "This is the contact page";
	}
}