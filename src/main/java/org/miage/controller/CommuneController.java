package org.miage.controller;

import org.miage.model.Utilisateur;
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
	public String getFeedbackPage(Model model) {
		model.addAttribute("ids", Utilisateur.getAllId());
		return "feedback";
	}
	
	@GetMapping("/formulaire")
	public String getFormPage(Model model) {
		model.addAttribute("formulaire", new Utilisateur()); 
		return "formulaire";
	}

	@PostMapping("/formulaire")
	public String greetingSubmit(@ModelAttribute Utilisateur utilisateur, Model model) {
		model.addAttribute("recommandations", matcherService.construireClassementVilles(utilisateur));
		return "result";
	}
	
	@PostMapping("/recommandations")
	public String getRecommandations(@ModelAttribute Utilisateur utilisateur, Model model) {
		model.addAttribute("recommandations", matcherService.getRecommandations(utilisateur));
		return "feedback";
	}

}