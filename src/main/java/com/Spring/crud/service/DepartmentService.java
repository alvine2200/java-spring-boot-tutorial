package com.Spring.crud.service;


import java.util.List;

import com.Spring.crud.entity.Department;
import com.Spring.crud.error.DepartmentNotFoundException;

/**
 * DepartmentService
 */
public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchAllDepartments();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void DeleteDepartmentById(Long departmentId);

    public Department updateDepartmentById(Long departmentId,Department department);

    public Department getDepartmentByName(String departmentName);
}