package com.Spring.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Spring.crud.entity.Department;

/**
 * DepartmentRepository
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    
    public Department findByDepartmentName(String departmentName);
}