package com.begin.passport1.Controller;

import com.begin.passport1.Entities.Person;
import com.begin.passport1.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public String homepage()
    {
        return "Homepage";
    }

    @GetMapping("/ApplyPassport")
    public String applyPassport(Model model) {
        Person person = new Person();
        model.addAttribute("person", person);
        return "ApplyPassport";
    }

    @GetMapping("/PassportIssueRequestList")
    public String viewData(Model model)
    {
        model.addAttribute("people", personService.getListOfIssueRequest());
        return "ValidationList";
    }

    @PostMapping("/SaveRequest")
    public String addIssueRequest(@ModelAttribute("person") Person person) {
        personService.addIssueRequest(person);
        return "Homepage";
    }

    @GetMapping("/ValidateApplication/{id}")
    public String ValidatePerson(@PathVariable ( value = "id") int id, Model model)
    {
        Person person = personService.getIssueRequest(id);
        model.addAttribute("person",person);
        return "ValidationPage";
    }

    @GetMapping("/RejectApplication/{id}")
    public String RejectApplication(@PathVariable ( value = "id") int id)
    {
        this.personService.deleteRequest(id);
        return "Homepage";
    }


}
