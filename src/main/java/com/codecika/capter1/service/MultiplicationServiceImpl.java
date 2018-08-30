package com.codecika.capter1.service;

import com.codecika.capter1.domain.Multiplication;
import org.springframework.beans.factory.annotation.Autowired;

public class MultiplicationServiceImpl implements MultiplicationService {


    private RandomGeneratedService randomGeneratedService;

    @Autowired
    public MultiplicationServiceImpl(RandomGeneratedService randomGeneratedService) {
        this.randomGeneratedService = randomGeneratedService;
    }


    @Override
    public Multiplication createRandomMultification() {
        int factorA = randomGeneratedService.generateRandomFactor();
        int factoeB = randomGeneratedService.generateRandomFactor();
        return new Multiplication(factorA,factoeB);
    }
}
