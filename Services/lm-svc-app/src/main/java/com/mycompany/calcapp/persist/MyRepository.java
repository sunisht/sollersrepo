package com.mycompany.calcapp.persist;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.calcapp.domain.MathOperation;

public interface MyRepository extends JpaRepository<MathOperation,Integer>{

}
