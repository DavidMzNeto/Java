package com.prova.test.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.prova.test.model.Team;
import com.prova.test.repository.TeamRepository;

@Service
public class TeamService {
    
    @Autowired
    private TeamRepository teamRepository;

    public List<Team> listAll(){
        return teamRepository.findAll();
    }

    public Optional<Team> findById(Long id) {
        return teamRepository.findById(id);
    }

    public Team register(@Validated Team team) {
        return teamRepository.save(team);
    }

    public void delete(Long id) {
        teamRepository.deleteById(id);
    }
    
    public Team update(@Validated Team novoTeam, Long id) {
        return teamRepository.findById(id).map(team -> {
            team.setName(novoTeam.getName());
            team.setDataRegistro(novoTeam.getDataRegistro());
            return teamRepository.save(team);
        }).orElseThrow();
    }
    
        
}
