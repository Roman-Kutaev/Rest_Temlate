package org.example.controller;

import org.example.data.Datum;
import org.example.repository.DatumRepository;
import org.example.service.DatumService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    private final DatumRepository datumRepository;
    private final DatumService datumService;

    public HomeController(DatumRepository datumRepository, DatumService datumService){
        this.datumRepository = datumRepository;
        this.datumService = datumService;
    }

    @GetMapping
    public String index(Model model){
        List<Datum> datumList = datumService.getAllUsers();
        model.addAttribute("allUsers", datumList);
        return "index";
    }
}
