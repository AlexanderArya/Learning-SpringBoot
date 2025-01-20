package com.manpro.mpservice2.repo;

import com.manpro.mpservice2.entities.person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<person, Long>{

    
}
