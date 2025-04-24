package com.prova.test.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.prova.test.model.Team;
import com.prova.test.service.TeamService;




@RestController
@RequestMapping("/Team")
public class TimeController {
    
    @Autowired
    private TeamService teamService;

    @GetMapping
    public List<Team> listAll() {
        return teamService.listAll();
    }

    @GetMapping("/{id}")
    public Optional<Team> findById(@PathVariable Long id) {
        return teamService.findById(id);
    }
    @PostMapping
    public Team register(@RequestBody Team time) {
        return teamService.register(time);
    }
    @PutMapping("/{id}")
    public Team update(@RequestBody Team time, @PathVariable Long id) {
        return teamService.update(time, id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        teamService.delete(id);
    }
}

