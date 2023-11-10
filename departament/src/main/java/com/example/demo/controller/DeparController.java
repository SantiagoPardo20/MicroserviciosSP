package com.example.demo.controller;

import com.example.demo.entitty.Departament;
import com.example.demo.service.DeparService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departament")
public class DeparController {
    private final DeparService deparService;

    public DeparController(DeparService deparService) {
        this.deparService = deparService;
    }
    @PostMapping
    public Departament creDepartament(@RequestBody Departament departament){
        return deparService.creatDepartament(departament);
    }

    @GetMapping("/{id}")
    public Departament getDepartamentByid(@PathVariable Integer id){
        return deparService.getDepartamentById(id);
    }

    @GetMapping
    public List<Departament> FindAll(){
        return deparService.FindAll();
    }
}
