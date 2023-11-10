package com.example.employe.repository;

import com.example.employe.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmRepository extends JpaRepository<Employee, Integer> {
}
