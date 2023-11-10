package com.example.employe.controller;

import com.example.employe.dto.ResponseDTO;
import com.example.employe.entity.Employee;
import com.example.employe.service.EmService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class Emcontroller {
    private final EmService emService;

    public Emcontroller(EmService emService) {
        this.emService = emService;
    }


    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return emService.saveEmployee(employee);
    }

    @GetMapping("/{id}")
    public ResponseDTO getemployeeByid(@PathVariable Integer id){
        return emService.getEmployeeByid(id);
    }

}
