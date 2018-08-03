package fr.association.adressehei.siteWeb.front.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccueilController {

    @GetMapping(value="/")
    public ModelAndView getHomeView(){
       ModelAndView view = new ModelAndView("index.html");
        return view;
    }

    @GetMapping(value="/adresse")
    public ModelAndView getAdresseView(){
        ModelAndView view =  new ModelAndView("adresse.html");
        return view;
    }

    @GetMapping(value = "/connexion")
    public ModelAndView getConnexionView(){
        ModelAndView view = new ModelAndView("connexion.html");
        return view;
    }
}
