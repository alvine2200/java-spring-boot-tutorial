package com.Spring.crud.service;


import java.util.List;

import com.Spring.crud.entity.Department;

/**
 * DepartmentService
 */
public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchAllDepartments();
}