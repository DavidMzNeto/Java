package com.prova.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.prova.test.model.Time;

@Repository
public interface TimeRepository extends JpaRepository<Time,Long>{

}
