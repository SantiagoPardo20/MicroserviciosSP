package com.example.employe.dto;

import com.example.employe.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public DepartamentDTO getDepartamentDTO() {
        return departamentDTO;
    }

    public void setDepartamentDTO(DepartamentDTO departamentDTO) {
        this.departamentDTO = departamentDTO;
    }

    private DepartamentDTO departamentDTO;


}
