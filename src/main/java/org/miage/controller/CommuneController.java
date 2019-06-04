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

	@GetMapping("/feedback")
	public String greetingForm(Model model) {
		model.addAttribute("ids", matcherService.getAllId());
		return "feedback";
	}

	@PostMapping("/formulaire")
	public String greetingSubmit(@ModelAttribute Formulaire formulaire, Model model) {
		model.addAttribute("ids", matcherService.construireClassementVilles(formulaire));
		return "result";
	}

}