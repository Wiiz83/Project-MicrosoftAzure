package org.miage.controller;

import org.miage.model.Formulaire;
import org.miage.service.MatcherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommuneController {
	
	@Autowired
	private MatcherService matcherService;

	@GetMapping("/greeting")
	public String greetingForm(Model model) {
		model.addAttribute("formulaire", new Formulaire());
		return "greeting";
	}

	@PostMapping("/formulaire")
	public String greetingSubmit(@ModelAttribute Formulaire formulaire) {
		matcherService.construireClassementVilles(formulaire);
		System.out.println(formulaire.getColleges());
		return "result";
	}

}