package br.com.caelum.ingresso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.caelum.ingresso.dao.FilmeDao;
import br.com.caelum.ingresso.dao.SalaDao;
import br.com.caelum.ingresso.model.form.SessaoForm;

@Controller
public class SessaoController {

	@Autowired
	private SalaDao salaDao;
	@Autowired
	private FilmeDao filmeDao;

	@GetMapping("/admin/sessao") // esse annotation garante que o método seja sempre o GET. 
	// A vantagem de usar é que podemos fazer um mapping para post e outro para get na mesma requisição
	public ModelAndView form(@RequestParam("salaId") Integer salaId, SessaoForm sessaoForm) {
		
		sessaoForm.setSalaId(salaId);
		
		// o requestparam faz: pega o parametro que vem da jsp e transforma na variável declarada
		ModelAndView mav = new ModelAndView("sessao/sessao");
		
		mav.addObject("sala", salaDao.findOne(salaId));
		mav.addObject("filmes", filmeDao.findAll());
		mav.addObject("form", sessaoForm);
		return mav;

	}

}
