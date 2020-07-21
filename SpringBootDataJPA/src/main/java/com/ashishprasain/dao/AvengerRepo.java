package com.ashishprasain.dao;

import org.springframework.data.repository.CrudRepository;

import com.ashishprasain.model.Avenger;

public interface AvengerRepo extends CrudRepository<Avenger, Integer> {

}
