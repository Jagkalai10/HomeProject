// THIS IS ONLY FOR LOGGER TO LOAD DATA TO THIS TABLE. RETRIEVAL DOES NOT USES THIS REPO

package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Price;

@Repository
public interface PriceRepository extends CrudRepository<Price, Integer> {
	
	Price findById(int id);
	

}
