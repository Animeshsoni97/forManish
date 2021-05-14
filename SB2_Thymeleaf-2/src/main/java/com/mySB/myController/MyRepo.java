package com.mySB.myController;

import org.springframework.data.repository.CrudRepository;

import com.mySB.model.Emp1;

public interface MyRepo extends CrudRepository<Emp1, Integer> {

	
}//interace