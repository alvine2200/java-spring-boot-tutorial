package com.Spring.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.crud.entity.Department;
import com.Spring.crud.repository.DepartmentRepository;

/**
 * DepartmentServiceImpl
 */
@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department){
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchAllDepartments()
    {
        return departmentRepository.findAll();
    }
    
}