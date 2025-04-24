package com.prova.test.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.prova.test.model.Time;
import com.prova.test.repository.TimeRepository;

@Service
public class TimeService {
    
    @Autowired
    private TimeRepository timeRepository;

    public List<Time> listAll(){
        return timeRepository.findAll();
    }

    public Optional<Time> findById(Long id) {
        return timeRepository.findById(id);
    }

    public Time register(@Validated Time time) {
        return timeRepository.save(time);
    }

    public void delete(Long id) {
        timeRepository.deleteById(id);
    }
    
    public Time update(@Validated Time novoTime, Long id) {
        return timeRepository.findById(id).map(time -> {
            time.setName(novoTime.getName());
            time.setDataRegistro(novoTime.getDataRegistro());
            return timeRepository.save(time);
        }).orElseThrow();
    }
    
        
}
