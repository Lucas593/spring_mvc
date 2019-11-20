package controller;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Refactor: Os comentários foram removidos para despoluir o codigo.

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		/*
		 * Refactor: não e necessario o uso do println dentro do controller.
		 */
		return "showForm";
	}

	/*
	 * Refactor: Remover processFormV2 porque acredito que ele faz a mesma coisa de
	 * processFormV3 porem de forma menos otimizada.
	 */

	@RequestMapping("/processFormV3")
	public String processFormV3(@RequestParam("studentName") String studentName, Model model) {

		studentName = studentName.toUpperCase();
		/*
		 * Refactor: não e necessario o uso do println dentro do controller.
		 */
		model.addAttribute("message", "Hello " + studentName);
		return "showForm";
	}
}
