package com.Spring.crud.repository;

import com.Spring.crud.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class DepartmentRepositoryTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private TestEntityManager entityManager;
    @BeforeEach
    void setUp() {
        Department department= Department.builder().departmentId(7L).departmentName("Health").departmentCode("101").departmentAddress("Kenyatta Hospital").build();
        entityManager.persist(department);
    }

    @Test
    public void testDepartmentFetchByIdWhenItsFound()
    {
        Department department=departmentRepository.findById(7L).get();
        assertEquals(department.getDepartmentName(),"Health");
    }

}