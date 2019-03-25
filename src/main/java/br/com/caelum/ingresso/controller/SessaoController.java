package br.com.caelum.ingresso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.caelum.ingresso.dao.FilmeDao;
import br.com.caelum.ingresso.dao.SalaDao;

@Controller
public class SessaoController {

	@Autowired
	private SalaDao salaDao;
	@Autowired
	private FilmeDao filmeDao;

	@GetMapping("/admin/sessao") // esse annotation garante que o método seja sempre o GET
	public ModelAndView form(@RequestParam("salaId") Integer salaId) {
		ModelAndView mav = new ModelAndView("sessao/sessao");
		mav.addObject("sala", salaDao.findOne(salaId));
		
		return mav;

	}

}
