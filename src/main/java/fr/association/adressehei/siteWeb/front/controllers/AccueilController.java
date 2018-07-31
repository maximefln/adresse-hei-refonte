package fr.association.adressehei.siteWeb.front.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccueilController {

    @GetMapping(value="/")
    public ModelAndView GetHomePage(String test){
       ModelAndView view = new ModelAndView("index.html");
        return view;
    }
}
