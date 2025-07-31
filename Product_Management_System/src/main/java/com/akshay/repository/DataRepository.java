package com.akshay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akshay.entity.Product;

@Repository
public interface DataRepository extends JpaRepository<Product , Integer> {

}
