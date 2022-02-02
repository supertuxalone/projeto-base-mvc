package projeto.base.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import projeto.base.mvc.model.Pessoa;
import projeto.base.mvc.repository.PessoaRepository;

@Controller
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;

	@RequestMapping(method = RequestMethod.GET, value = "/menu")
	public ModelAndView inicio() {
		ModelAndView modelAndView = new ModelAndView("cadastros/menu");
		modelAndView.addObject("pessoaOj", new Pessoa());
		return modelAndView;

	}

}
