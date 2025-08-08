package com.Tracker.TrackerAPI.controller;

import com.Tracker.TrackerAPI.entity.Tracker;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tasks")
public class TrackerController {
    private Map<Long, Tracker> tasks=new HashMap<>();

    @PostMapping
    public ResponseEntity<Tracker> createTask(@RequestBody Tracker tracker){
        tasks.put(tracker.getId(),tracker);
        return ResponseEntity.status(HttpStatus.CREATED).body(tracker);
    }

    @GetMapping
    public ResponseEntity<List <Tracker>> getAllTasks(){
        return ResponseEntity.ok(new ArrayList<>(tasks.values()));
    }

    @PatchMapping("/status/{id}")
    public ResponseEntity<Void> status(@PathVariable long id,@RequestBody Tracker tracker){
        Tracker existing=tasks.get(id);
        if (existing==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        existing.setStatus(tracker.getStatus());
        tasks.put(id,existing);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/removeTask/{id}")
    public ResponseEntity<Void> removeTask(@PathVariable long id){
        Tracker existing=tasks.get(id);
        if (existing==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        tasks.remove(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/dueBefore")
    public ResponseEntity<List <Tracker>> dueBefore(){
        List<Tracker> trackerList=new ArrayList<>();
        for (Tracker value:tasks.values()){
            int dueBefore=value.getDueDate().compareTo("2025-12-31");
            if (dueBefore <= 0){
                trackerList.add(value);
            }
        }

        return ResponseEntity.ok(trackerList);
    }
}