package com.mycompany.calcapp.persist;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.calcapp.domain.MathOperation;
/**
 * extends Jpa repository 
 * @author Lawrence Nkafu
 *
 */
public interface MyRepository extends JpaRepository<MathOperation,Integer>{

}
