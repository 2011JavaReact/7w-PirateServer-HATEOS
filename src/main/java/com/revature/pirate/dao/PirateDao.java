package com.revature.pirate.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.revature.pirate.model.Pirate;
import com.revature.pirate.model.Role;

@RepositoryRestResource()
public interface PirateDao extends JpaRepository<Pirate, Integer>{
	public List<Pirate> findByName(String name);
}
