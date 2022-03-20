package com.nsCorps.movie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MovieController {

	public MovieController() {
		System.out.println(this.getClass().getSimpleName() + " The Object is Created");
	}

	@GetMapping
	public ModelAndView saveMovie(String movieName, String actorName) {
		System.out.println(" The Movie " + movieName + actorName);
		return new ModelAndView("movieProfile");
	}

}
