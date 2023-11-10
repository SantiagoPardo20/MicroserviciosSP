package com.example.demo.service;

import com.example.demo.entitty.Departament;
import com.example.demo.repository.DeparRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeparService {
    private final DeparRepository deparRepository;

    public DeparService(DeparRepository deparRepository) {
        this.deparRepository = deparRepository;
    }
    public Departament creatDepartament(Departament departament){
        return deparRepository.save(departament);
    }
    public Departament getDepartamentById(Integer id){
        return deparRepository.findById(id).get();
    }
    public List<Departament> FindAll() {
        return deparRepository.findAll();
    }

}
