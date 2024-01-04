package com.Spring.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.crud.entity.Department;
import com.Spring.crud.service.DepartmentService;

/**
 * DepartmentController
 */
@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }
    
}