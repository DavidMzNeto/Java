package com.prova.test.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.prova.test.model.Time;
import com.prova.test.service.TimeService;




@RestController
@RequestMapping("/Time")
public class TimeController {
    
    @Autowired
    private TimeService timeService;

    @GetMapping
    public List<Time> listAll() {
        return timeService.listAll();
    }

    @GetMapping("/{id}")
    public Optional<Time> findById(@PathVariable Long id) {
        return timeService.findById(id);
    }
    @PostMapping
    public Time register(@RequestBody Time time) {
        return timeService.register(time);
    }
    @PutMapping("/{id}")
    public Time update(@RequestBody Time time, @PathVariable Long id) {
        return timeService.update(time, id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        timeService.delete(id);
    }
}

