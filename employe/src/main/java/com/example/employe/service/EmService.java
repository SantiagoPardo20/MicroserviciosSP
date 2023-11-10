package com.example.employe.service;

import com.example.employe.dto.DepartamentDTO;
import com.example.employe.dto.ResponseDTO;
import com.example.employe.entity.Employee;
import com.example.employe.repository.EmRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmService {
    private final EmRepository emRepository;
    private final RestTemplate restTemplate;

    public EmService(EmRepository emRepository, RestTemplate restTemplate) {
        this.emRepository = emRepository;
        this.restTemplate = restTemplate;
    }
    public Employee saveEmployee(Employee employee){
        return emRepository.save(employee);
    }

    public ResponseDTO getEmployeeByid(Integer id){
        ResponseDTO responseDTO=new ResponseDTO();
        Employee employee=new Employee();
        employee=emRepository.findById(id).get();

        ResponseEntity<DepartamentDTO> responseEntity = restTemplate.getForEntity("http://localhost:8080/api/departament/"+employee.getDepartamentid(),
                DepartamentDTO.class);
        DepartamentDTO departamentDTO = responseEntity.getBody();

        responseDTO.setEmployee(employee);
        responseDTO.setDepartamentDTO(departamentDTO);
        return responseDTO;
    }

}
