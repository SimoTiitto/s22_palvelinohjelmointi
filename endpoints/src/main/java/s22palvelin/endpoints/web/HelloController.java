package s22palvelin.endpoints.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("hello")
	@ResponseBody
	public String sayHelloToSomenone(@RequestParam(name = "name", required = false, defaultValue = "John") String name,
			@RequestParam(name = "location") String location) {
		return "Welcome to the " + location + " " + name;
	}
}
