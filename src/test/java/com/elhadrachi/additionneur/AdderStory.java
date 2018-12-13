package com.elhadrachi.additionneur;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import com.elhadrachi.additionneur.steps.AdderServiceSteps;

public class AdderStory {
    @Steps
    AdderServiceSteps restSteps;
    @Given("a number")
    public void givenANumber() throws Exception{
        restSteps.givenBaseAndAdder((int)Math.random(), (int)Math.random());
    }
    @When("I submit another number $num to adder")
    public void whenISubmitToAdderWithNumber(int num){
        restSteps.whenAdd();
    }

    @Then("I get a sum of the numbers")
    public void thenIGetTheSum(){
        restSteps.summedUp();
    }
}

