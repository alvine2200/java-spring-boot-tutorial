package com.Spring.crud.service;

import java.util.List;
import java.util.Objects;

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

    @Override
    public Department fetchDepartmentById(Long departmentId)
    {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void DeleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartmentById(Long departmentId,Department department) {
        Department dep=departmentRepository.findById(departmentId).get();
        // if attributes is not null and not blank
        if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())){
            dep.setDepartmentName(department.getDepartmentName());
        }

        if(Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())){
            dep.setDepartmentCode(department.getDepartmentCode());
        }

        if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())){
            dep.setDepartmentAddress(department.getDepartmentAddress());
        }

        return departmentRepository.save(dep);
    }

    public Department getDepartmentByName(String departmentName){
        return departmentRepository.findByDepartmentName(departmentName);
    }
    
    
}