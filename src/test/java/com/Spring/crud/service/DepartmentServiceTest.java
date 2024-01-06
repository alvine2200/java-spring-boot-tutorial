package com.Spring.crud.service;

import com.Spring.crud.entity.Department;
import com.Spring.crud.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;
    @BeforeEach
    void setUp() {
        Department department= Department.builder().departmentId(8L).departmentName("ENG").departmentCode("102").departmentAddress("Moi-Eldy").build();

        Mockito.when(departmentRepository.findByDepartmentName("ENG")).thenReturn(department);
    }

    @Test
    public void testWhenDepartmentNameIsFound()
    {
        String departmentName="ENG";
        Department department=departmentService.getDepartmentByName(departmentName);
        assertEquals(departmentName,department.getDepartmentName());
    }

}