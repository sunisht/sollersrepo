package com.sollers.cal.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sollers.cal.domain.MyNumber;

public interface MyNumberRepository extends JpaRepository<MyNumber,Integer> {

	/*
	 * Author:Minh Nguyen
	 * Purpose: Find last record in MyNumber table, which has been insert into database.
	 */
	Optional<MyNumber> findTopByOrderByIdDesc();
	/*
	 * Author:Minh Nguyen
	 * Purpose: List all records in MyNumber table order by Id desc
	 */
	List<MyNumber>  findAllByOrderByIdDesc();

}
