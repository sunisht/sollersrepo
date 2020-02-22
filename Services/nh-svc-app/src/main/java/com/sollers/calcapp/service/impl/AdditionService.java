package com.sollers.calcapp.service.impl;

import com.sollers.calcapp.domain.Addition;
import com.sollers.calcapp.domain.Subtraction;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class AdditionService implements ICalculatorService {
    @Override
    public ResponseEntity<Addition> add(Addition obj) {
        return null;
    }

    @Override
    public ResponseEntity<Subtraction> subtract(Subtraction obj) {
        return null;
    }

    @Override
    public List<Addition> ViewDataBaseAddition() {
        return null;
    }

    @Override
    public List<Subtraction> ViewDataBaseSubtraction() {
        return null;
    }
}
