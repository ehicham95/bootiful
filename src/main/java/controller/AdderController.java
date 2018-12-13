package controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.AdderService;

public class AdderController {

    private AdderService adderService;

    public AdderController(AdderService adderService) {
        this.adderService = adderService;
    }
    @GetMapping("/current")
    public int currentNum() {
        return adderService.currentBase();
    }
    @PostMapping("/add/current")
    public int add(@RequestParam int num) {
        return adderService.add(num);
    }
    @PostMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public int accumulate(@RequestParam int num){
        return this.adderService.accumulate(num);
    }

}
