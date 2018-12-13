package com.elhadrachi.additionneur;

import com.elhadrachi.additionneur.controller.AdderController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import net.serenitybdd.jbehave.SerenityStory;
import org.jbehave.core.annotations.BeforeStory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import com.elhadrachi.additionneur.service.AdderService;

@ContextConfiguration(classes = {
        AdderController.class, AdderService.class })
public class AdderIntegrationTest extends SerenityStory {
    @Autowired
    private AdderService adderService;
    @BeforeStory
    public void init() {
        RestAssuredMockMvc.standaloneSetup(new AdderController(adderService));
    }
}