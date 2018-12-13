package com.elhadrachi.additionneur.steps;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import com.elhadrachi.additionneur.service.AdderService;


@ContextConfiguration(classes = AdderService.class)
public class AdderServiceSteps {
    @Autowired

    private AdderService adderService;
    private int givenNumber;
    private int base;
    private int sum;
    public void givenBaseAndAdder(int base, int adder) {
        this.base = base;
        adderService.baseNum(base);
        this.givenNumber = adder;
    }
    public void whenAdd() {
        sum = adderService.add(givenNumber);
    }
    public void summedUp() {
        Assert.assertEquals(base + givenNumber, sum);
    }
    public void sumWrong() {
        Assert.assertNotEquals(base + givenNumber, sum);
    }
    public void whenAccumulate() {
        sum = adderService.accumulate(givenNumber);
    }
    public int getGivenNumber(){
        return this.givenNumber;
    }

}