package com.Spring.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Department
 */
@Entity
public class Department {

    //primary key
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    private String departmentName;
    private String departmentCode;
    private String departmentAddress;

    public Long getDepartmentId()
    {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId)
    {
        this.departmentId=departmentId;
    }

    public String getDepartmentName()
    {
        return departmentName;
    }

    public void setDepartmentName(String departmentName)
    {
        this.departmentName=departmentName;
    }

    public String getDepartmentAddress()
    {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress)
    {
        this.departmentAddress=departmentAddress;
    }

    public String getDepartmentCode()
    {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode)
    {
        this.departmentCode=departmentCode;
    }


    //constructor
    public Department(Long departmentId,String departmentName,String departmentCode,String departmentAddress){
        this.departmentId=departmentId;
        this.departmentAddress=departmentAddress;
        this.departmentCode=departmentCode;
        this.departmentName=departmentName;

    }

    public Department()
    {
        //
    }

    @Override
    public String toString() {
    return "Department{"+
        "departmentId="+departmentId+
        ", departmentName='"+departmentName+ '\''+
        ", departmentCode='"+departmentCode+'\''+
        ",departmentAddress='"+departmentAddress+
        '}';
    }

}