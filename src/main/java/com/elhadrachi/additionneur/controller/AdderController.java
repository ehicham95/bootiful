package com.elhadrachi.additionneur.controller;

import org.springframework.web.bind.annotation.*;
import com.elhadrachi.additionneur.service.AdderService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AdderController {

    private AdderService adderService;

    public AdderController(AdderService adderService) {
        this.adderService = adderService;
    }
    @GetMapping("/current")
    @CrossOrigin(origins = "http://localhost:4200")
    public int currentNum() {
        adderService.baseNum((int)(Math.random()*100));
        return adderService.currentBase();
    }
    @PostMapping("/add/current")
    @CrossOrigin(origins = "http://localhost:4200")
    public int add(@RequestParam int num) {
        return adderService.add(num);
    }
    @PostMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public int accumulate(@RequestParam int num){
        return this.adderService.accumulate(num);
    }

}
