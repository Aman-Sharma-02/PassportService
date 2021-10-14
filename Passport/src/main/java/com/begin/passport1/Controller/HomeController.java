package com.begin.passport1.Controller;

import com.begin.passport1.Entities.Person;
import com.begin.passport1.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public String home(Model model)
    {
        model.addAttribute("person", new Person());
        return "apply_passport";
    }

    @GetMapping("/request_list")
    public ModelAndView getRequestList() {
        ModelAndView mav = new ModelAndView("passport_validator");
        mav.addObject("person", personService.getPersons());
        return mav;
    }

    @PostMapping(value = "/savePerson")
    public String addPerson() {
        return "successful";
    }


}
