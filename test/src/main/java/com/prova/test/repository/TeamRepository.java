package com.prova.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.prova.test.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team,Long>{

}
