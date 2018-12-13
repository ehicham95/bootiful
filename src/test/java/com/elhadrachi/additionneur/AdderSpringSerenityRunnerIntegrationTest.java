package com.elhadrachi.additionneur;

import net.serenitybdd.junit.spring.integration.SpringIntegrationSerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import steps.AdderServiceSteps;

@RunWith(SpringIntegrationSerenityRunner.class)
@ContextConfiguration(locations = "classpath:adder-beans.xml")
public class AdderSpringSerenityRunnerIntegrationTest {

    @Steps private AdderServiceSteps adderSteps;
    @Value("#{props['adder']}") private int adder;
    @Test
    public void givenNumber_whenAdd_thenSummedUp() {
        adderSteps.givenBaseAndAdder((int)Math.random(), (int)Math.random());
        adderSteps.whenAdd();
        adderSteps.summedUp();
    }
}
