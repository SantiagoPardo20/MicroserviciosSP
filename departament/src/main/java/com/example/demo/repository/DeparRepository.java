package com.example.demo.repository;

import com.example.demo.entitty.Departament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeparRepository extends JpaRepository<Departament, Integer> {
}
