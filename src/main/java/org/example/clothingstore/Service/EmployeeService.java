package org.example.clothingstore.Service;

import org.example.clothingstore.Model.entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<EmployeeEntity> findAll();
    void saveEmployee(EmployeeEntity employee);
    EmployeeEntity findEmployeeById(int id);
}
