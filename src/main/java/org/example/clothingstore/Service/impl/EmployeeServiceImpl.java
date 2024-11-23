package org.example.clothingstore.Service.impl;

import org.example.clothingstore.Model.entity.EmployeeEntity;
import org.example.clothingstore.Repository.EmployeeRepository;
import org.example.clothingstore.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<EmployeeEntity> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(EmployeeEntity employee) {
        employeeRepository.save(employee);
    }

    @Override
    public EmployeeEntity findEmployeeById(int id) {
        return employeeRepository.findById(id).get();
    }


}
