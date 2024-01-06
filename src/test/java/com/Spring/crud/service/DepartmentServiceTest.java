package com.Spring.crud.service;

import com.Spring.crud.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;
    @BeforeEach
    void setUp() {
    }

    @Test
    void saveDepartment() {
    }

    @Test
    void fetchAllDepartments() {
    }

    @Test
    void fetchDepartmentById() {
    }

    @Test
    void deleteDepartmentById() {
    }

    @Test
    void updateDepartmentById() {
    }

    @Test
    public void getDepartmentByName() {
        String departmentName="ICT";
        Department department= departmentService.getDepartmentByName(departmentName);
        assertEquals(departmentName,department.getDepartmentName());
    }
}