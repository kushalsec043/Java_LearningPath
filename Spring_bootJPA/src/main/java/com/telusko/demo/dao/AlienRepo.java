package com.telusko.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.telusko.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>
{

	Alien findByaname(String aname);

	List<Alien> findByaidGreaterThan(int i);
	
	@Query("from Alien where aid=?1 order by aname")
	List<Alien> findByaidSorted(int aid);
}
