package com.venkatesh.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.venkatesh.entity.BookDetailsEntity;


@Repository
public interface BookServiceRepository extends JpaRepository<BookDetailsEntity, Serializable>{
	
	
	
	

}
