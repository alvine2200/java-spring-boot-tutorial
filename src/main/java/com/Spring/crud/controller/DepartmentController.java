package com.Spring.crud.controller;

import java.util.List;
import java.util.logging.Logger;

import com.Spring.crud.error.DepartmentNotFoundException;
import com.Spring.crud.error.SuccessHandler;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    private static final Logger logger=Logger.getLogger(DepartmentController.class.getName());
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        logger.info("In the saveDepartmentMethod of the DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchAllDepartments()
    {
        return departmentService.fetchAllDepartments();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException
    {
        return departmentService.fetchDepartmentById(departmentId);
    }
    
    @DeleteMapping("/departments/{id}")
    public String DeleteDepartmentById(@PathVariable("id") Long departmentId)
    {
        departmentService.DeleteDepartmentById(departmentId);
        return "Department Deleted Successfully";
    }

    @PutMapping("/departments/{id}/update")
    public Department updateDepartmentById(@PathVariable("id") Long departmentId,@RequestBody Department department)
    {
        return departmentService.updateDepartmentById(departmentId,department);
    }

    @GetMapping("/departments/name/{name}")
    public Department getDepartmentByFirstName (@PathVariable("name") String departmentName) throws SuccessHandler
    {
        return departmentService.getDepartmentByName(departmentName);
    }


}