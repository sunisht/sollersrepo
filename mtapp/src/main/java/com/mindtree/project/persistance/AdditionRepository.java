package com.mindtree.project.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sun.xml.bind.v2.model.core.ID;

@Repository
public interface AdditionRepository<T> extends JpaRepository<T, ID> {

}
