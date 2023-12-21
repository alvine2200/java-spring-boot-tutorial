package com.Spring.crud.service;

import com.Spring.crud.entity.Department;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentService
{

    public Department saveDepartment(Department department);
}
