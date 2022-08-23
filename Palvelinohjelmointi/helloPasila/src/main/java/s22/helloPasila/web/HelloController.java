package s22.helloPasila.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("moikkaa")
	@ResponseBody
	public String sayHelloToSomenone(
			@RequestParam(name = "nimesi", required = false, defaultValue = "Muumi") String nimi,
			@RequestParam(name = "ika") int age) {
		return "Hei " + nimi + " " + age + " vuotta.";
	}

}
