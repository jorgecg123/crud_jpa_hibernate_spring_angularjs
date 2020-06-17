package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modeldto.Auto;

@Repository
public interface AutoRepository extends CrudRepository<Auto, Long> {

}
