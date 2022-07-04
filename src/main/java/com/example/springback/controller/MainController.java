package com.example.springback.controller;

import com.example.springback.entity.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MainController {

    @GetMapping("/")
    public ResponseEntity main (){
        return ResponseEntity.ok("bingo");
    }

    @GetMapping("/task")
    public ResponseEntity task(){
        return ResponseEntity.ok(new Task(1L,"ХЛЕЕЕЕЕЕЕБ"));
    }
}
