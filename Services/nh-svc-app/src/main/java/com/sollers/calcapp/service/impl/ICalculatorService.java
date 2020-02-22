package com.sollers.calcapp.service.impl;

import com.sollers.calcapp.domain.Addition;
import com.sollers.calcapp.domain.Subtraction;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICalculatorService {
    public ResponseEntity<Addition> add(Addition obj);
    public ResponseEntity<Subtraction> subtract(Subtraction obj);
    public List<Addition> ViewDataBaseAddition();
    public List<Subtraction> ViewDataBaseSubtraction();

}
