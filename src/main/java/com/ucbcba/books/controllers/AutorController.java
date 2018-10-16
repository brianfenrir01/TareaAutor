package com.ucbcba.books.controllers;

import com.ucbcba.books.entities.Autor;
import com.ucbcba.books.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class AutorController {

    AutorController autorController;

    @Autowired
    public void setAutorController(AutorController autorController){this.autorController=autorController;}
    @RequestMapping(value="/autors",method = RequestMethod.GET)
    public  String index (Model model){
        List<Autor> autors = (List) AutorService.listAllAutores;
        model.addAttribute( "autors",autors);
        return "autors";
    }

}
